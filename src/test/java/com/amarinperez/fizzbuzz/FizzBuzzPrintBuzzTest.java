package com.amarinperez.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzPrintBuzzTest extends FizzBuzzTestBase {
	@Test
	public void getBuzzOnFive() {
		assertBuzzOn(5);
	}

	@Test
	public void getBuzzOnTen() {
		assertBuzzOn(10);
	}

	private void assertBuzzOn(int i) {
		assertEquals("buzz", fizzbuzz.get(i));
	}
}
