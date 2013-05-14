import java.util.ArrayList;
import java.util.List;


public class DoorPasser {

	public List<Boolean> pass(int doorCount, int passCount) {
		ArrayList<Boolean> result = initializeDoorsAreOpen(doorCount);
		
		if (passCount >= 1)
			reverseDoors(doorCount, 1, result);
		
		if (passCount >= 2 && doorCount >= 2)
			reverseDoors(doorCount, 2, result);
		
		if (passCount == 3 && doorCount >= 3)
			reverseDoors(doorCount, 3, result);
		
		return result;
	}

	private void reverseDoors(int doorCount, int currentPass, ArrayList<Boolean> result) {
		for (int doorIndex = currentPass - 1; doorIndex < doorCount; doorIndex += currentPass)
			result.set(doorIndex, !result.get(doorIndex));
	}

	private ArrayList<Boolean> initializeDoorsAreOpen(int doorCount) {
		ArrayList<Boolean> doorsAreOpen = new ArrayList<>();

		for (int index = 0; index < doorCount; index++)
			doorsAreOpen.add(false);
		
		return doorsAreOpen;
	}

}
