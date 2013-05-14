import java.util.ArrayList;
import java.util.List;


public class DoorPasser {

	public List<Boolean> pass(int doorCount, int passCount) {
		ArrayList<Boolean> result = initializeDoorsAreOpen(doorCount);
		
		if (passCount >= 1)
			for (int doorIndex = 0; doorIndex < doorCount; doorIndex++)
				result.set(doorIndex, !result.get(doorIndex));
		
		if (passCount >= 2 && doorCount >= 2)
			for (int doorIndex = 1; doorIndex < doorCount; doorIndex += 2)
				result.set(doorIndex, !result.get(doorIndex));
		
		if (passCount == 3 && doorCount >= 3)
			for (int doorIndex = 2; doorIndex < doorCount; doorIndex += 3)
				result.set(doorIndex, !result.get(doorIndex));
		
		return result;
	}

	private ArrayList<Boolean> initializeDoorsAreOpen(int doorCount) {
		ArrayList<Boolean> doorsAreOpen = new ArrayList<>();

		for (int index = 0; index < doorCount; index++)
			doorsAreOpen.add(false);
		
		return doorsAreOpen;
	}

}
