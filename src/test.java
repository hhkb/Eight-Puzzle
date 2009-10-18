import java.util.ArrayList;
import java.util.List;

import model.State;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evaluatedValue = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);	list.add(8);	list.add(3);
		list.add(1); 	list.add(6);	list.add(4);
		list.add(0);	list.add(7);	list.add(5);
		
		State state = new State(); //initial state
		state.setCellValues(list);
		
		/**
		 * cell 1
		 */
		switch(state.getCellList().get(0).getCellValue()){
			case 1 : evaluatedValue += 0; break;
			case 2 : evaluatedValue += 1; break;
			case 3 : evaluatedValue += 2; break;
			case 4 : evaluatedValue += 3; break;
			case 5 : evaluatedValue += 4; break;
			case 6 : evaluatedValue += 3; break;
			case 7 : evaluatedValue += 2; break;
			case 8 : evaluatedValue += 1; break;
			case 0 : evaluatedValue += 2; break;
		}
		
		/**
		 * cell 2
		 */
		switch(state.getCellList().get(1).getCellValue()){
			case 1 : evaluatedValue += 1; break;
			case 2 : evaluatedValue += 0; break;
			case 3 : evaluatedValue += 1; break;
			case 4 : evaluatedValue += 2; break;
			case 5 : evaluatedValue += 3; break;
			case 6 : evaluatedValue += 2; break;
			case 7 : evaluatedValue += 3; break;
			case 8 : evaluatedValue += 2; break;
			case 0 : evaluatedValue += 1; break;
		}
		
		/**
		 * cell 3
		 */
		switch(state.getCellList().get(2).getCellValue()){
			case 1 : evaluatedValue += 2; break;
			case 2 : evaluatedValue += 1; break;
			case 3 : evaluatedValue += 0; break;
			case 4 : evaluatedValue += 1; break;
			case 5 : evaluatedValue += 2; break;
			case 6 : evaluatedValue += 3; break;
			case 7 : evaluatedValue += 4; break;
			case 8 : evaluatedValue += 3; break;
			case 0 : evaluatedValue += 2; break;
		}
		
		/**
		 * cell 4
		 */
		switch(state.getCellList().get(3).getCellValue()){
			case 1 : evaluatedValue += 1; break;
			case 2 : evaluatedValue += 2; break;
			case 3 : evaluatedValue += 3; break;
			case 4 : evaluatedValue += 2; break;
			case 5 : evaluatedValue += 3; break;
			case 6 : evaluatedValue += 2; break;
			case 7 : evaluatedValue += 1; break;
			case 8 : evaluatedValue += 0; break;
			case 0 : evaluatedValue += 1; break;
		}
		
		/**
		 * cell 5
		 */
		switch(state.getCellList().get(4).getCellValue()){
			case 1 : evaluatedValue += 2; break;
			case 2 : evaluatedValue += 1; break;
			case 3 : evaluatedValue += 2; break;
			case 4 : evaluatedValue += 1; break;
			case 5 : evaluatedValue += 2; break;
			case 6 : evaluatedValue += 1; break;
			case 7 : evaluatedValue += 2; break;
			case 8 : evaluatedValue += 1; break;
			case 0 : evaluatedValue += 0; break;
		}
		
		/**
		 * cell 6
		 */
		switch(state.getCellList().get(5).getCellValue()){
			case 1 : evaluatedValue += 3; break;
			case 2 : evaluatedValue += 2; break;
			case 3 : evaluatedValue += 1; break;
			case 4 : evaluatedValue += 0; break;
			case 5 : evaluatedValue += 1; break;
			case 6 : evaluatedValue += 2; break;
			case 7 : evaluatedValue += 3; break;
			case 8 : evaluatedValue += 2; break;
			case 0 : evaluatedValue += 1; break;
		}
		
		/**
		 * cell 7
		 */
		switch(state.getCellList().get(6).getCellValue()){
			case 1 : evaluatedValue += 2; break;
			case 2 : evaluatedValue += 3; break;
			case 3 : evaluatedValue += 4; break;
			case 4 : evaluatedValue += 3; break;
			case 5 : evaluatedValue += 2; break;
			case 6 : evaluatedValue += 1; break;
			case 7 : evaluatedValue += 0; break;
			case 8 : evaluatedValue += 1; break;
			case 0 : evaluatedValue += 2; break;
		}
		
		/**
		 * cell 8
		 */
		switch(state.getCellList().get(7).getCellValue()){
			case 1 : evaluatedValue += 3; break;
			case 2 : evaluatedValue += 2; break;
			case 3 : evaluatedValue += 3; break;
			case 4 : evaluatedValue += 2; break;
			case 5 : evaluatedValue += 1; break;
			case 6 : evaluatedValue += 0; break;
			case 7 : evaluatedValue += 1; break;
			case 8 : evaluatedValue += 2; break;
			case 0 : evaluatedValue += 1; break;
		}
		
		/**
		 * cell 9
		 */
		switch(state.getCellList().get(8).getCellValue()){
			case 1 : evaluatedValue += 4; break;
			case 2 : evaluatedValue += 3; break;
			case 3 : evaluatedValue += 2; break;
			case 4 : evaluatedValue += 1; break;
			case 5 : evaluatedValue += 0; break;
			case 6 : evaluatedValue += 1; break;
			case 7 : evaluatedValue += 2; break;
			case 8 : evaluatedValue += 3; break;
			case 0 : evaluatedValue += 2; break;
		}
		if (state.getCellList().get(0).getCellValue() != 1)
			evaluatedValue += 1;

		if (state.getCellList().get(1).getCellValue() != 2)
			evaluatedValue += 1;

		if (state.getCellList().get(2).getCellValue() != 3)
			evaluatedValue += 1;

		if (state.getCellList().get(3).getCellValue() != 8)
			evaluatedValue += 1;

		if (state.getCellList().get(4).getCellValue() != 0)
			evaluatedValue += 1;

		if (state.getCellList().get(5).getCellValue() != 4)
			evaluatedValue += 1;

		if (state.getCellList().get(6).getCellValue() != 7)
			evaluatedValue += 1;

		if (state.getCellList().get(7).getCellValue() != 6)
			evaluatedValue += 1;

		if (state.getCellList().get(8).getCellValue() != 5)
			evaluatedValue += 1;
		
		System.out.println("The value is: " + evaluatedValue);
	}
}
