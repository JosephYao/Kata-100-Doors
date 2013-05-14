import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DoorPasser {

	public List<Boolean> pass(int doorCount, int passCount) {
		List<Boolean> result = new ArrayList<>(Collections.nCopies(doorCount, false));
		
		for (int currentPass = 1; currentPass <= passCount; currentPass++)
			reverseDoors(doorCount, currentPass, result);
		
		return result;
	}

	private void reverseDoors(int doorCount, int currentPass, List<Boolean> result) {
		for (int doorIndex = currentPass - 1; doorIndex < doorCount; doorIndex += currentPass)
			result.set(doorIndex, !result.get(doorIndex));
	}

}
