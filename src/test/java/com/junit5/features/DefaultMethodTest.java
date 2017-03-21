package com.junit5.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DefaultMethodTest {

	@Test
	void shouldBeTheCorrectTutorial() {
		String tutorial = "JUnit 5";
		
		assertEquals("JUnit 5", tutorial);
	}
	
}
