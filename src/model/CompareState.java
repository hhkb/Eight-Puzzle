package model;

import java.util.Comparator;

public class CompareState implements Comparator<State> {


	public int compare(State o1, State o2) {
		State state1 = o1;
		State state2 = o2;
		
		int flag = ((Integer)state1.getEstimatedValue()).compareTo((Integer)state2.getEstimatedValue());
		return flag;
	}

}
