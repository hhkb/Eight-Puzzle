package evaluator;

import model.State;

public class TilesOutOfPlaceEvaluatorImpl implements Evaluator {
	/**
	 * The heuristic value is the number of tiles out of place.
	 */
	public int evaluateState(State state) {

		int evaluatedValue = 0;

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
		
		return evaluatedValue;
	}

}
