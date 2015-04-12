package com.amarinperez.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSequence {
	private List<String> items = new ArrayList<String>();
	
	@Override
	public String toString()
	{
		return String.join(" ", items.toArray(new String[0]));
	}

	public FizzBuzzSequence add(String item) {
		items.add(item);
		return this;
	}
}
