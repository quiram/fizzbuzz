package com.amarinperez.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzPrintFizzBuzzTest extends FizzBuzzTestBase {
	@Test
	public void getFizzbuzzOnFifteen() {
		assertFizzBuzzOn(15);
	}

	@Test
	public void getFizzbuzzOnThirty() {
		assertFizzBuzzOn(30);
	}

	private void assertFizzBuzzOn(int i) {
		assertEquals("fizzbuzz", fizzbuzz.get(i));
	}
}
