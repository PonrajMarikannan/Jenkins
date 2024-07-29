package com.raj.junittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Task.junittask.Task1;

class Task1Test {
	@Test
	void testSumOfDigits() {
		assertEquals(6,Task1.SumOfDigits(123));
	}
}
