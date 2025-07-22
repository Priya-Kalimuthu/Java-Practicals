package junit;

import static org.junit.Assert.*;
import org.junit.Test;

 class SquareTest {


	@Test
	public void test() {
		JUnitEx1 testCase = new JUnitEx1();
		int sq = testCase.square(5);
		
		assertEquals(25, sq);
		
	}

}
