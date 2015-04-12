package com.amarinperez.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzPrintFizzTest extends FizzBuzzTestBase {
	@Test
	public void getFizzOnThree() {
		assertFizzOn(3);
	}

	@Test
	public void getFizzOnSix() {
		assertFizzOn(6);
	}

	private void assertFizzOn(int i) {
		assertEquals("fizz", fizzbuzz.get(i));
	}
}
