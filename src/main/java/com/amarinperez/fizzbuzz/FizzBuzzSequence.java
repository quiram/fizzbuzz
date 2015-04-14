package com.amarinperez.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzSequence {
	private List<String> items = new ArrayList<String>();

	@Override
	public String toString() {
		return String.join(" ", items.toArray(new String[0]));
	}

	public FizzBuzzSequence add(String item) {
		items.add(item);
		return this;
	}

	public long getCountOf(String item) {
		return items.stream().filter(s -> s.equals(item)).count();
	}

	public long getCountOfIntegers() {
		return items.stream().filter(s -> isInteger(s)).count();
	}

	private boolean isInteger(String item) {
		try {
			Integer.parseInt(item);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}

	public String getFullReport() {
		List<String> keys = Arrays.asList(new String[] {"fizz", "buzz", "fizzbuzz", "lucky"});
		List<String> reportLines = new ArrayList<String>();
		
		for (String key : keys) {
			reportLines.add(key + ": " + getCountOf(key));
		}
		
		reportLines.add("integer: " + getCountOfIntegers());
		
		return String.join(System.lineSeparator(), reportLines.toArray(new String[0]));
	}
}
