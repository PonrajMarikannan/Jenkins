package com.raj.junittask;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Task.junittask.Task3;

class Task3Test {

	@Test
	void testIO() {
		assertTrue(Task3.IO(123));
	}
	
	@Test
	void testIO1() {
		assertFalse(Task3.IO(1231));
	}

}
