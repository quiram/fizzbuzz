package com.amarinperez.fizzbuzz.fizzbuzzsequencetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmptySequenceTest extends FizzBuzzSequenceTestBase {

	@Override
	protected void fillSequence() {
		// Nothing to fill
	}

	@Override
	protected int getExpectedCountOf(String key) {
		return 0;
	}

	@Test
	public void providesEmptyString() {
		assertEquals("", sequence.toString());
	}

	@Test
	public void containsNoFizz() {
		assertEquals(0, sequence.getCountOf("fizz"));
	}
}
