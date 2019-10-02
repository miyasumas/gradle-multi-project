package com.github.miyasumas.multiproject.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void test() {
		Assertions.assertEquals("1", FizzBuzz.of(1).getMessage());
		Assertions.assertEquals("Fizz", FizzBuzz.of(3).getMessage());
		Assertions.assertEquals("Buzz", FizzBuzz.of(5).getMessage());
		Assertions.assertEquals("Fizz Buzz", FizzBuzz.of(15).getMessage());
	}
}
