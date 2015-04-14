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
	protected abstract int getExpectedCountOf(String key);
	
	@Test
	public void expectedFizzReport()
	{
		assertReportContainsLineFor("fizz");
	}

	@Test
	public void expectedBuzzReport()
	{
		assertReportContainsLineFor("buzz");
	}
	
	@Test
	public void expectedFizzBuzzReport()
	{
		assertReportContainsLineFor("fizzbuzz");
		
	}
	
	@Test
	public void expectedLuckyReport()
	{
		assertReportContainsLineFor("lucky");
	}
	
	@Test
	public void expectedIntegerReport()
	{
		assertReportContainsLineFor("integer");
	}

	protected void assertReportContainsLineFor(String key) {
		assertThat(report, containsString(key + ": " + getExpectedCountOf(key)));
	}
}
