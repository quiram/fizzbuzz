package com.amarinperez.fizzbuzz;

public class FizzBuzzRunner {

	public FizzBuzzSequence run(int first, int last) {
		if (first > last)
			throw new IllegalArgumentException("Invalid range, first can't be higher than last.");

		FizzBuzz fizzbuzz = new FizzBuzz();
		FizzBuzzSequence sequence = new FizzBuzzSequence();
		
		for(int i = first; i <= last; i++)
			sequence.add(fizzbuzz.get(i));
		
		return sequence;
	}
}
