package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Cell {
	
	private int cellId;
	private int cellValue;
	private List<Integer> prossibleNextMoves;
	
	public Cell(){
		cellId = -1;
		prossibleNextMoves = new ArrayList<Integer>();
	}
	
	public Cell(int cellId){
		this.cellId = cellId;
		prossibleNextMoves = new ArrayList<Integer>();
	}
	
	/**
	 * Setter for cellId.
	 * @param cellId new value for cellId
	 */
	public void setCellId(int cellId) {
	    this.cellId = cellId;
	}

	/**
	 * Getter for cellId.
	 * @return cellId
	 */
	public int getCellId() {
	    return cellId;
	}
	
	/**
	 * Setter for cellValue.
	 * @param cellValue new value for cellValue
	 */
	public void setCellValue(int cellValue) {
	    this.cellValue = cellValue;
	}

	/**
	 * Getter for cellValue.
	 * @return cellValue
	 */
	public int getCellValue() {
	    return cellValue;
	}
	
	/**
	 * Setter for prossibleNextMoves.
	 * @param prossibleNextMoves new value for prossibleNextMoves
	 */
	public void setProssibleNextMoves(List<Integer> prossibleNextMoves) {
	    Iterator<Integer> ltr = prossibleNextMoves.iterator();
	    while(ltr.hasNext()){
	    	this.prossibleNextMoves.add(ltr.next().intValue());
	    }
	}

	/**
	 * Getter for prossibleNextMoves.
	 * @return prossibleNextMoves
	 */
	public List<Integer> getProssibleNextMoves() {
	    return prossibleNextMoves;
	}
	
	

}
