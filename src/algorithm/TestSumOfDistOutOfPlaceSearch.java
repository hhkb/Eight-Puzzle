package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

import model.Cell;
import model.State;
import model.CompareState;
import evaluator.Evaluator;
import evaluator.SumOfDistOutOfPlaceEvaluatorImpl;


public class TestSumOfDistOutOfPlaceSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * set initial state
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);	list.add(8);	list.add(3);
		list.add(1); 	list.add(6);	list.add(4);
		list.add(0);	list.add(7);	list.add(5);
		
		State initialState = new State(); //initial state
		initialState.setCellValues(list);
		initialState.setTopInTree(true);

		/**
		 * set goal state
		 */
		List<Integer> goalList = new ArrayList<Integer>();
		goalList.add(1);	goalList.add(2);	goalList.add(3);
		goalList.add(8); 	goalList.add(0);	goalList.add(4);
		goalList.add(7);	goalList.add(6);	goalList.add(5);
		
		State goalState = new State();	//goal state
		goalState.setCellValues(goalList);
		
		/**
		 * initialize the open state list
		 */
		List<State> openStateList = new ArrayList<State>();		//open list
		openStateList.add(initialState); //add initial state

		
		/**
		 * initialize the close state list
		 */
		List<State> closeStateList = new ArrayList<State>();	//close list
		closeStateList.clear();
		
		/**
		 * initialize the evaluator
		 */
		Evaluator evaluator = new SumOfDistOutOfPlaceEvaluatorImpl();

		heuristicSearch(goalState,openStateList,closeStateList,evaluator);
	}
	
	/**
	 * Find goal state using tile out of place search
	 * @param currState
	 * @param goalState
	 * @param openStateList
	 * @param closeStateList
	 * @param evaluator
	 */
	private static void heuristicSearch(State goalState,
			List<State> openStateList, List<State> closeStateList, Evaluator evaluator){
		
		if(openStateList.size() != 0){
			State currState = openStateList.get(0);
			//printStateList(openStateList);
			printState(openStateList.get(0));
			openStateList.remove(0);
			closeStateList.add(currState);
			
			State newState;
			
			Iterator<Integer> prossibleMovesLtr = currState.getEmptyCell().getProssibleNextMoves().iterator();
			List<State> evaluatedStateList = new ArrayList<State>();
			while(prossibleMovesLtr.hasNext()){
				newState = move(currState, currState.getEmptyCell().getCellId(), prossibleMovesLtr.next().intValue());
				if(!stateInStateList(newState, closeStateList)){
					newState.setEstimatedValue(evaluator.evaluateState(newState));
					//evaluatedStateList.add(newState);
					openStateList.add(newState);
				}
			}
			//sortStateList(evaluatedStateList);
			sortStateList(openStateList);

/*			while(evaluatedStateList.size() > 0){
				openStateList.add(0, evaluatedStateList.get(evaluatedStateList.size()-1));
				evaluatedStateList.remove(evaluatedStateList.size()-1);
			}*/
			
			if(!sameState(currState, goalState)){
				heuristicSearch(goalState,openStateList,closeStateList,evaluator);
			}else{
				System.out.println("goal state found!!");
			}

		}


	}
	
	/**
	 * print a list of state
	 * @param stateList
	 */
	private static void printStateList(List<State> stateList){
		
		System.out.println("state list begin:");
		
		Iterator<State> ltr = stateList.iterator();
		while(ltr.hasNext()){
			printState(ltr.next());
		}
		
		System.out.println("state list end: \n");
	}
	
	/**
	 * print the state in console
	 * @param state
	 */
	private static void printState(State state) {

		Iterator<Cell> ltr = state.getCellList().iterator();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ltr.next().getCellValue() + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * sort the state list
	 * @param stateList
	 */
	private static void sortStateList(List<State> stateList){
		CompareState comparator = new CompareState();
		Collections.sort(stateList, comparator);
	}
	
	/**
	 * move to a new state
	 * @param state
	 * @param currCellId
	 * @param distCellId
	 * @return new state
	 */
	private static State move(State state, int currCellId, int distCellId){
		//printProssibleMoves(state.getEmptyCell().getProssibleNextMoves());
		//System.out.println("move from:"+currCellId + "to:" + distCellId);
		State newState = state.makeOneCopy();
		
		newState.getCellList().get(distCellId-1).setCellValue(0);
		newState.getCellList().get(currCellId-1).setCellValue(
				state.getCellList().get(distCellId-1).getCellValue());
		
		return newState;
	}
	
	/**
	 * test if two states are same
	 * @param state1
	 * @param state2
	 * @return true if same, else false
	 */
	private static boolean sameState(State state1, State state2){
		
		Iterator<Cell> ltr1 = state1.getCellList().iterator();
		Iterator<Cell> ltr2 = state2.getCellList().iterator();
		
		while(ltr1.hasNext() && ltr2.hasNext()){
			if(ltr1.next().getCellValue() != ltr2.next().getCellValue()){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Check if state already in a state list
	 * @param state
	 * @param stateList
	 * @return true if in list, false if not
	 */
	private static boolean stateInStateList(State state, List<State> stateList) {
		boolean sameList = false;
		Iterator<State> stateLtr = stateList.iterator();
		while (stateLtr.hasNext()) {
			if (!sameList) {
				Iterator<Cell> currCellLtr = stateLtr.next().getCellList()
						.iterator();
				Iterator<Cell> cellLtr = state.getCellList().iterator();

				while(currCellLtr.hasNext()) {
					
					int currNumber = currCellLtr.next().getCellValue();
					int number = cellLtr.next().getCellValue();
					//System.out.println("|" + currNumber + " " + number + "|");
					
					if (currNumber == number) {
						sameList = true;
					} else {
						sameList = false;
						break;
					}
				}
			} else{
				return sameList;
			}
		}
		return sameList;
	}
}
