package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testlogin {


	@Test
	public void testCorrectlogin() {
		Logic ab = new Logic();
		ab.setUsername("admin");
		ab.setPassword("admin123");
		assertTrue(ab.checklogin());
	}
	
	@Test
	public void testWronglogin() {
		Logic ab = new Logic();
		ab.setUsername("ADMIN");
		ab.setPassword("ADMIN123");
		assertTrue(ab.checklogin());
	}

}
