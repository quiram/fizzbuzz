package com.amarinperez.fizzbuzz.fizzbuzzsequencetest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.amarinperez.fizzbuzz.FizzBuzzSequence;

public class SequenceWithTwoElementsTest {
	private FizzBuzzSequence sequence;

	@Before
	public void setup() {
		sequence = new FizzBuzzSequence();
		sequence.add("fizz").add("7");
	}

	@Test
	public void providesFizzSevenAsString() {
		assertEquals("fizz 7", sequence.toString());
	}

	@Test
	public void hasOneInteger() {
		assertEquals(1, sequence.getCountOfIntegers());
	}
}
