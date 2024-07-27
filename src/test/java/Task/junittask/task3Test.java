package Task.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class task3Test {

	@Test
	void testIO() {
		assertTrue(task3.IO(123));
	}
	
	@Test
	void testIO1() {
		assertFalse(task3.IO(1231));
	}

}
