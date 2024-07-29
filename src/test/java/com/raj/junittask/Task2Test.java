package com.raj.junittask;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Task.junittask.Task2;

class Task2Test {

	@Test
	void testMOD() {
		assertEquals(3,Task2.MOD(123));
	}

}
