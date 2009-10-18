package evaluator;

import model.*;

public class PossibleHeuristic  implements Evaluator{
	
	/**
	 * Counting the number of digits after a specific tile that is smaller 
	 * than the digit in it (excluding the space which is 0 in the program).
	 * The heuristic value is the sum of each tile counter.
	 */
	public int evaluateState(State state){
		
		int evaluatedValue = 0;
		
		for (int i = 0; i <9; i++){
			for(int j = i+1; j < 9; j++){
				if(state.getCellList().get(j).getCellValue() == 0)
					evaluatedValue += 0;
				else if(state.getCellList().get(j).getCellValue()<state.getCellList().get(i).getCellValue())
					evaluatedValue += 1;	
			}
		}
		return evaluatedValue;
	}
}
