import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DoorPasserTest {

	private DoorPasser passer = new DoorPasser();

	@Test
	public void no_door_no_pass() {
		assertEquals(expectedDoorsAreOpen(), passer.pass(0, 0));
	}

	@Test
	public void any_door_no_pass() {
		assertEquals(expectedDoorsAreOpen(false), passer.pass(1, 0));
		assertEquals(expectedDoorsAreOpen(false, false), passer.pass(2, 0));
	}
	
	private ArrayList<Boolean> expectedDoorsAreOpen(Boolean... isOpenFlag) {
		return new ArrayList<Boolean>(Arrays.asList(isOpenFlag));
	}
	
}
