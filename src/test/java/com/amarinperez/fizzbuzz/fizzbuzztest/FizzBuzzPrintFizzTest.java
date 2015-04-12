package com.amarinperez.fizzbuzz.fizzbuzztest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzPrintFizzTest extends FizzBuzzTestBase {
	@Test
	public void getFizzOnSix() {
		assertFizzOn(6);
	}

	@Test
	public void getFizzOnNine() {
		assertFizzOn(9);
	}

	private void assertFizzOn(int i) {
		assertEquals("fizz", fizzbuzz.get(i));
	}
}
