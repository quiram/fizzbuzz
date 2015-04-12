package com.amarinperez.fizzbuzz;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class FizzBuzzRunnerTest {
	@Rule
	public ExpectedException onBadInput = ExpectedException.none();

	private FizzBuzzRunner runner;
	
	@Before
	public void setup() {
		runner = new FizzBuzzRunner();
	}

	@Test
	public void failOnBadRange() {
		onBadInput.expect(IllegalArgumentException.class);
		onBadInput.expectMessage(containsString("range"));
		runner.run(2, 1);
	}
	
	@Test
	public void singleElement()
	{
		assertEquals("1", runFizzBuzzFor(1, 1));
	}
	
	@Test
	public void twoElements()
	{
		assertEquals("1 2", runFizzBuzzFor(1, 2));
	}

	@Test
	public void elementsIncludingFizz()
	{
		assertEquals("lucky 4 buzz fizz", runFizzBuzzFor(3, 6));
	}

	private String runFizzBuzzFor(int first, int last) {
		String result = runner.run(first, last).toString();
		return result;
	}
}
