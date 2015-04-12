package com.amarinperez.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzSequenceTest {
	private FizzBuzzSequence sequence;

	@Before
	public void setup() {
		sequence = new FizzBuzzSequence();
	}

	@Test
	public void emptySequence()
	{
		assertEquals("", sequence.toString());
		assertEquals(0, sequence.getCountOf("fizz"));
	}
	
	@Test
	public void sequenceWithFizzOnly()
	{
		sequence.add("fizz");
		assertEquals("fizz", sequence.toString());
		assertEquals(1, sequence.getCountOf("fizz"));
		assertEquals(0, sequence.getCountOf("buzz"));
		assertEquals(0, sequence.getCountOfIntegers());
	}
	
	@Test
	public void sequenceWithMultipleElements()
	{
		sequence.add("fizz").add("7");
		assertEquals("fizz 7", sequence.toString());
		assertEquals(1, sequence.getCountOfIntegers());
	}
}
