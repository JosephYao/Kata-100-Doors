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
	
	@Test
	public void any_door_one_pass() {
		assertEquals(expectedDoorsAreOpen(true), passer.pass(1, 1));
		assertEquals(expectedDoorsAreOpen(true, true), passer.pass(2, 1));
	}
	
	@Test
	public void any_door_two_pass() {
		assertEquals(expectedDoorsAreOpen(true, false), passer.pass(2, 2));
		assertEquals(expectedDoorsAreOpen(true, false, true), passer.pass(3, 2));
		assertEquals(expectedDoorsAreOpen(true, false, true, false), passer.pass(4, 2));
	}
	
	@Test
	public void any_door_three_pass() {
		assertEquals(expectedDoorsAreOpen(true, false), passer.pass(2, 3));
		assertEquals(expectedDoorsAreOpen(true, false, false), passer.pass(3, 3));
		assertEquals(expectedDoorsAreOpen(true, false, false, false), passer.pass(4, 3));
		assertEquals(expectedDoorsAreOpen(true, false, false, false, true, true), passer.pass(6, 3));
	}
	
	@Test
	public void acceptance_test() {
		assertEquals(expectedDoorsAreOpen(
				true, false, false, true, false, false, false, false, true, false), 
				passer.pass(10, 10));
	}
	
	private ArrayList<Boolean> expectedDoorsAreOpen(Boolean... isOpenFlag) {
		return new ArrayList<Boolean>(Arrays.asList(isOpenFlag));
	}
	
}
