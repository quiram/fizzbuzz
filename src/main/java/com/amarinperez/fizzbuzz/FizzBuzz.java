package com.amarinperez.fizzbuzz;

public class FizzBuzz {

	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private static final String LUCKY = "lucky";

	public String get(int i) {
		if (i < 1) {
			throw new IllegalArgumentException("Argument must be higher than zero.");
		}

		if (numberContainsThree(i)) {
			return LUCKY;
		}

		if (i % 15 == 0) {
			return FIZZ + BUZZ;
		}

		if (i % 3 == 0) {
			return FIZZ;
		}
		if (i % 5 == 0) {
			return BUZZ;
		}

		return Integer.toString(i);
	}

	private boolean numberContainsThree(int i) {
		return Integer.toString(i).contains("3");
	}
}
