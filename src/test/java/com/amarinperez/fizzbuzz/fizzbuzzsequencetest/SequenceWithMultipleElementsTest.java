package com.amarinperez.fizzbuzz.fizzbuzzsequencetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SequenceWithMultipleElementsTest extends FizzBuzzSequenceTestBase {

	@Override
	protected void fillSequence() {
		sequence.add("fizz").add("7").add("fizz").add("buzz").add("fizzbuzz");
	}

	@Override
	protected int getExpectedCountOf(String key) {
		switch(key){
			case "fizz":
				return 2;
			case "buzz":
				return 1;
			case "fizzbuzz":
				return 1;
			default:
				return 0;
		}
	}

	@Test
	public void providesExpectedElementsAsString() {
		assertEquals("fizz 7 fizz buzz fizzbuzz", sequence.toString());
	}

	@Test
	public void hasOneInteger() {
		assertEquals(1, sequence.getCountOfIntegers());
	}
}
