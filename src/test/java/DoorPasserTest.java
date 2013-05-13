import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DoorPasserTest {

	@Test
	public void no_door_no_pass() {
		DoorPasser passer = new DoorPasser();
		List<Boolean> actualDoorsAreOpen = passer.pass(0, 0);
		assertEquals(new ArrayList<Boolean>(), actualDoorsAreOpen);
	}
	
}
