package com.amarinperez.fizzbuzz.fizzbuzzsequencetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceWithFizzOnlyTest extends FizzBuzzSequenceTestBase {
	@Override
	protected void fillSequence() {
		sequence.add("fizz");
	}

	@Override
	protected int getExpectedCountOf(String key) {
		if (key.equals("fizz")) {
			return 1;
		} else {
			return 0;
		}
	}

	@Test
	public void producesFizzAsString() {
		assertEquals("fizz", sequence.toString());
	}

	@Test
	public void hasOneFizzItem() {
		assertEquals(1, sequence.getCountOf("fizz"));
	}

	@Test
	public void hasNoBuzzItems() {
		assertEquals(0, sequence.getCountOf("buzz"));
	}

	@Test
	public void hasNoIntegers() {
		assertEquals(0, sequence.getCountOfIntegers());
	}
}
