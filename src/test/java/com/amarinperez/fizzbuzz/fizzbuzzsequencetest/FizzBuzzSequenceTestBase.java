package com.amarinperez.fizzbuzz.fizzbuzzsequencetest;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

import com.amarinperez.fizzbuzz.FizzBuzzSequence;

public abstract class FizzBuzzSequenceTestBase {

	protected FizzBuzzSequence sequence;
	private String report;

	@Before
	public void setup() {
		sequence = new FizzBuzzSequence();
		fillSequence();
		report = sequence.getFullReport();
	}

	protected abstract void fillSequence();
	protected abstract int getExpectedFizzCount();
	protected abstract int getExpectedBuzzCount();
	protected abstract int getExpectedFizzBuzzCount();
	protected abstract int getExpectedLuckyCount();
	
	@Test
	public void expectedFizzReport()
	{
		assertThat(report, containsString("fizz: " + getExpectedFizzCount()));
	}
	
	@Test
	public void expectedBuzzReport()
	{
		assertThat(report, containsString("buzz: " + getExpectedBuzzCount()));
	}
	
	@Test
	public void expectedFizzBuzzReport()
	{
		assertThat(report, containsString("fizzbuzz: " + getExpectedFizzBuzzCount()));
		
	}
	
	@Test
	public void expectedLuckyReport()
	{
		assertThat(report, containsString("lucky: " + getExpectedLuckyCount()));
	}
}
