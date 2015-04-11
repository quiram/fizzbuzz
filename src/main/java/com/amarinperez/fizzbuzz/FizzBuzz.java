package com.amarinperez.fizzbuzz;

public class FizzBuzz {

	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";

	public String get(int i) {
		if (i < 1)
			throw new IllegalArgumentException("Argument must be higher than zero.");

		String result = "";

		if (i % 3 == 0)
			result = FIZZ;

		if (i % 5 == 0)
			result += BUZZ;

		if (result.equals(""))
			result = Integer.toString(i);

		return result;
	}

}
