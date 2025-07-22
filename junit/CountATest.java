package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JUnitEx1 test1 = new JUnitEx1();
		int c = test1.countA("Arya");
		
		assertEquals(2, c);
	}

}
