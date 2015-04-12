package com.amarinperez.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzPrintNumberTest extends FizzBuzzTestBase {
	@Test
	public void getOne() {
		assertNumberOn(1);
	}

	@Test
	public void getTwo() {
		assertNumberOn(2);
	}

	private void assertNumberOn(int i) {
		assertEquals(Integer.toString(i), fizzbuzz.get(i));
	}
}
