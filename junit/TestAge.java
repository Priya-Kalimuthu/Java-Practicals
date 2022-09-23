package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAge {

	@Test  //+ve Test case
	public void testCorrectAge() {
		Age ab = new Age();
		ab.setAge(25);
		assertTrue(ab.checkAge());
	}
	@Test  //-ve Test case
	public void testWrongAge() {
		Age ab = new Age();
		ab.setAge(10);
		assertFalse(ab.checkAge());

}
}
