package com.amarinperez.fizzbuzz.fizzbuzztest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzPrintLuckyTest extends FizzBuzzTestBase {
	@Test
	public void getLuckyOnThree() {
		assertLuckyOn(3);
	}

	@Test
	public void getLuckyOnThirteen() {
		assertLuckyOn(13);
	}

	private void assertLuckyOn(int i) {
		assertEquals("lucky", fizzbuzz.get(i));
	}
}
