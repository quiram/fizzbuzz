package com.amarinperez.fizzbuzz.fizzbuzzsequencetest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.amarinperez.fizzbuzz.FizzBuzzSequence;

public class SequenceWithFizzOnlyTest {
	private FizzBuzzSequence sequence;

	@Before
	public void setup() {
		sequence = new FizzBuzzSequence();
		sequence.add("fizz");
	}

	@Test
	public void producesFizzAsString()
	{
		assertEquals("fizz", sequence.toString());
	}
	
	@Test
	public void hasOneFizzItem()
	{
		assertEquals(1, sequence.getCountOf("fizz"));
	}

	@Test
	public void hasNoBuzzItems()
	{
		assertEquals(0, sequence.getCountOf("buzz"));
	}
	
	@Test
	public void hasNoIntegers()
	{
		assertEquals(0, sequence.getCountOfIntegers());
	}
}
