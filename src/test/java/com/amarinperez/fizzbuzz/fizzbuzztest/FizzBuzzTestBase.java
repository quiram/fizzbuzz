package com.amarinperez.fizzbuzz.fizzbuzztest;

import org.junit.Before;

import com.amarinperez.fizzbuzz.FizzBuzz;

public class FizzBuzzTestBase {

	protected FizzBuzz fizzbuzz;

	@Before
	public void setup() {
		fizzbuzz = new FizzBuzz();
	}

}
