import java.util.ArrayList;
import java.util.List;


public class DoorPasser {

	public List<Boolean> pass(int doorCount, int passCount) {
		ArrayList<Boolean> result = initializeDoorsAreOpen(doorCount);
		
		if (passCount >= 1)
			result.set(0, true);
		
		return result;
	}

	private ArrayList<Boolean> initializeDoorsAreOpen(int doorCount) {
		ArrayList<Boolean> doorsAreOpen = new ArrayList<>();

		for (int index = 0; index < doorCount; index++)
			doorsAreOpen.add(false);
		
		return doorsAreOpen;
	}

}
