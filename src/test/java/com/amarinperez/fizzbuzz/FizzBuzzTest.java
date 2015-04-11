package com.amarinperez.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzbuzz;

	@Before
	public void setup() {
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void getOne() {
		assertNumberOn(1);
	}

	@Test
	public void getTwo() {
		assertNumberOn(2);
	}

	@Test
	public void getFizzOnThree() {
		assertFizzOn(3);
	}

	@Test
	public void getFizzOnSix() {
		assertFizzOn(6);
	}

	@Test
	public void getBuzzOnFive() {
		assertBuzzOn(5);
	}

	@Test
	public void getBuzzOnTen() {
		assertBuzzOn(10);
	}

	@Test
	public void getFizzbuzzOnFifteen() {
		assertFizzBuzzOn(15);
	}

	@Test
	public void getFizzbuzzOnThirty() {
		assertFizzBuzzOn(30);
	}

	private void assertNumberOn(int i) {
		assertEquals(Integer.toString(i), fizzbuzz.get(i));
	}

	private void assertFizzOn(int i) {
		assertEquals("fizz", fizzbuzz.get(i));
	}

	private void assertBuzzOn(int i) {
		assertEquals("buzz", fizzbuzz.get(i));
	}

	private void assertFizzBuzzOn(int i) {
		assertEquals("fizzbuzz", fizzbuzz.get(i));
	}
}
