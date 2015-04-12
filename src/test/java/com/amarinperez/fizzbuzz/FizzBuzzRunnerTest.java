package com.amarinperez.fizzbuzz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class FizzBuzzRunnerTest {
	@Rule
	public ExpectedException onBadInput = ExpectedException.none();
	
	@Test
	public void failOnBadRange() {
		onBadInput.expect(IllegalArgumentException.class);
		onBadInput.expectMessage(containsString("range"));
		FizzBuzzRunner runner = new FizzBuzzRunner();
		runner.run(2, 1);
	}
	
	@Test
	public void singleElement()
	{
		FizzBuzzRunner runner = new FizzBuzzRunner();
		String result = runner.run(1, 1);
		assertEquals("1", result);
	}
	
	@Test
	public void twoElements()
	{
		FizzBuzzRunner runner = new FizzBuzzRunner();
		String result = runner.run(1, 2);
		assertEquals("1 2", result);
	}
	
	@Test
	public void elementsIncludingFizz()
	{
		FizzBuzzRunner runner = new FizzBuzzRunner();
		String result = runner.run(3, 6);
		assertEquals("lucky 4 buzz fizz", result);
	}
}
