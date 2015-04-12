package com.amarinperez.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzSequenceTest {
	@Test
	public void emptySequence()
	{
		FizzBuzzSequence sequence = new FizzBuzzSequence();
		assertEquals("", sequence.toString());
	}
	
	@Test
	public void sequenceWithFizzOnly()
	{
		FizzBuzzSequence sequence = new FizzBuzzSequence();
		sequence.add("fizz");
		assertEquals("fizz", sequence.toString());
	}
	
	@Test
	public void sequenceWithFizzAndBuzz()
	{
		FizzBuzzSequence sequence = new FizzBuzzSequence();
		sequence.add("fizz").add("buzz");
		assertEquals("fizz buzz", sequence.toString());
	}
}
