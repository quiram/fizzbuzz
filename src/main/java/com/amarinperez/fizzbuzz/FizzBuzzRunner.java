package com.amarinperez.fizzbuzz;

public class FizzBuzzRunner {

	public String run(int first, int last) {
		if (first > last)
			throw new IllegalArgumentException("Invalid range, first can't be higher than last.");

		FizzBuzz fizzbuzz = new FizzBuzz();
		StringBuilder builder = new StringBuilder();
		
		for(int i = first; i <= last; i++)
			builder.append(fizzbuzz.get(i)).append(" ");
		
		return builder.toString().trim();
	}
}
