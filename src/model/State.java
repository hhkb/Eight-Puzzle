package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import model.Cell;

public class State {
	
	private List<Cell> cellList;
	private List<State> childStates;
	private int estimatedValue;
	private boolean topInTree;

	/**
	 * initialize cells
	 */
	private Cell cell1 = new Cell(1);	private Cell cell2 = new Cell(2);	private Cell cell3 = new Cell(3);
	private Cell cell4 = new Cell(4);	private Cell cell5 = new Cell(5);	private Cell cell6 = new Cell(6);
	private Cell cell7 = new Cell(7);	private Cell cell8 = new Cell(8);	private Cell cell9 = new Cell(9);
	
	public State(){
		
		cellList = new ArrayList<Cell>();
		childStates = new ArrayList<State>();
		topInTree = false;
		
		this.linkCells();
		this.setCellList();

	}
	
	
	/**
	 * Setter for cellList.
	 * @param cellList new value for cellList
	 */
	private void setCellList() {
	    this.cellList.add(cell1);
	    this.cellList.add(cell2);
	    this.cellList.add(cell3);
	    this.cellList.add(cell4);
	    this.cellList.add(cell5);	
	    this.cellList.add(cell6);
	    this.cellList.add(cell7);
	    this.cellList.add(cell8);
	    this.cellList.add(cell9);
	}

	/**
	 * Getter for cellList.
	 * @return cellList
	 */
	public List<Cell> getCellList() {
	    return cellList;
	}
	
	/**
	 * Setter for childStates.
	 * @param childStates new value for childStates
	 */
	public void setChildStates(List<State> childStates) {
	    this.childStates = childStates;
	}

	/**
	 * Getter for childStates.
	 * @return childStates
	 */
	public List<State> getChildStates() {
	    return childStates;
	}
	
	
	/**
	 * Set cell values by Integer List
	 */
	
	public void setCellValues(List<Integer> list){
		Iterator<Integer> ltr = list.iterator();
		while(ltr.hasNext()){
			cell1.setCellValue(ltr.next());
			cell2.setCellValue(ltr.next());
			cell3.setCellValue(ltr.next());
			cell4.setCellValue(ltr.next());
			cell5.setCellValue(ltr.next());
			cell6.setCellValue(ltr.next());
			cell7.setCellValue(ltr.next());
			cell8.setCellValue(ltr.next());
			cell9.setCellValue(ltr.next());
		}
	}
	
	/**
	 * get cell values
	 */
	
	public List<Integer> getCellValues(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(cell1.getCellValue());
		list.add(cell2.getCellValue());		
		list.add(cell3.getCellValue());
		list.add(cell4.getCellValue());
		list.add(cell5.getCellValue());
		list.add(cell6.getCellValue());
		list.add(cell7.getCellValue());
		list.add(cell8.getCellValue());
		list.add(cell9.getCellValue());
		
		return list;
	}
	
	/**
	 * Setter for topInTree.
	 * @param topInTree new value for topInTree
	 */
	public void setTopInTree(boolean topInTree) {
	    this.topInTree = topInTree;
	}

	/**
	 * Getter for topInTree.
	 * @return topInTree
	 */
	public boolean getTopInTree() {
	    return topInTree;
	}
	
	/**
	 * Setter for estimatedValue.
	 * @param estimatedValue new value for estimatedValue
	 */
	public void setEstimatedValue(int estimatedValue) {
	    this.estimatedValue = estimatedValue;
	}

	/**
	 * Getter for estimatedValue.
	 * @return estimatedValue
	 */
	public int getEstimatedValue() {
	    return estimatedValue;
	}
	
	
	/**
	 * Link cells
	 */
	
	private void linkCells(){
		/**
		 * link cell 1
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		cell1.setProssibleNextMoves(list);
		
		/**
		 * link cell 2
		 */
		list.clear();
		list.add(1);
		list.add(3);
		list.add(5);
		cell2.setProssibleNextMoves(list);
		
		/**
		 * link cell 3
		 */
		list.clear();
		list.add(2);
		list.add(6);
		cell3.setProssibleNextMoves(list);
		
		/**
		 * link cell 4
		 */
		list.clear();
		list.add(1);
		list.add(5);
		list.add(7);
		cell4.setProssibleNextMoves(list);
		
		/**
		 * link cell 5
		 */
		list.clear();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		cell5.setProssibleNextMoves(list);
		
		/**
		 * link cell 6
		 */
		list.clear();
		list.add(3);
		list.add(5);
		list.add(9);
		cell6.setProssibleNextMoves(list);
		
		/**
		 * link cell 7
		 */
		list.clear();
		list.add(4);
		list.add(8);
		cell7.setProssibleNextMoves(list);
		
		/**
		 * link cell 8
		 */
		list.clear();
		list.add(5);
		list.add(7);
		list.add(9);
		cell8.setProssibleNextMoves(list);
		
		/**
		 * link cell 9
		 */
		list.clear();
		list.add(6);
		list.add(8);
		cell9.setProssibleNextMoves(list);
		
	}
	
	public Cell getEmptyCell(){
		Iterator<Cell> ltr = cellList.iterator();
		while(ltr.hasNext()){
			Cell cell = ltr.next();
			if(cell.getCellValue() == 0){
				return cell;
			}
		}
		return null;
	}
	
	public State makeOneCopy(){
		
		State newState = new State();
		newState.setCellValues(this.getCellValues());
		newState.setTopInTree(false);
		
		return newState;
	}

	
}
