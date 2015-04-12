package com.amarinperez.fizzbuzz;

import org.junit.Before;

public class FizzBuzzTestBase {

	protected FizzBuzz fizzbuzz;

	@Before
	public void setup() {
		fizzbuzz = new FizzBuzz();
	}

}
