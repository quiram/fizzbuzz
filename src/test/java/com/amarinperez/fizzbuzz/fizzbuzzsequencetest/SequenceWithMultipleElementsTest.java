package com.amarinperez.fizzbuzz.fizzbuzzsequencetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceWithMultipleElementsTest extends FizzBuzzSequenceTestBase {

	@Override
	protected void fillSequence() {
		sequence.add("fizz").add("7").add("fizz").add("buzz").add("fizzbuzz");
	}

	@Override
	protected int getExpectedFizzCount() {
		return 2;
	}

	@Override
	protected int getExpectedBuzzCount() {
		return 1;
	}

	@Override
	protected int getExpectedFizzBuzzCount() {
		return 1;
	}

	@Override
	protected int getExpectedLuckyCount() {
		return 0;
	}

	@Test
	public void providesExpectedElementsAsString() {
		assertEquals("fizz 7 fizz buzz fizzbuzz", sequence.toString());
	}

	@Test
	public void hasOneInteger() {
		assertEquals(1, sequence.getCountOfIntegers());
	}
}
