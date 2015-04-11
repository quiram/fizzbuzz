package com.amarinperez.fizzbuzz;

import static org.hamcrest.Matchers.containsString;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzBadArgumentTest {

	@Rule
	public ExpectedException onBadInput = ExpectedException.none();
	private FizzBuzz fizzbuzz;

	@Before
	public void setup() {
		onBadInput.expect(IllegalArgumentException.class);
		onBadInput.expectMessage(containsString("zero"));
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void failIfGettingZero() {
		fizzbuzz.get(0);
	}

	@Test
	public void failIfNegativeNumber() {
		fizzbuzz.get(-1);
	}
}
