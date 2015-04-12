package com.amarinperez.fizzbuzz.fizzbuzztest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzPrintFizzBuzzTest extends FizzBuzzTestBase {
	@Test
	public void getFizzbuzzOnFifteen() {
		assertFizzBuzzOn(15);
	}

	@Test
	public void getFizzbuzzOnFortyfive() {
		assertFizzBuzzOn(45);
	}

	private void assertFizzBuzzOn(int i) {
		assertEquals("fizzbuzz", fizzbuzz.get(i));
	}
}
