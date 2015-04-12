package com.amarinperez.fizzbuzz.fizzbuzzsequencetest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.amarinperez.fizzbuzz.FizzBuzzSequence;

public class EmptySequenceTest {
	private FizzBuzzSequence sequence;

	@Before
	public void setup() {
		sequence = new FizzBuzzSequence();
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
