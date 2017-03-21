package com.junit5.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "In Classes - This class will test in a noble style")
class DefaultMethodTest {

	@DisplayName("In Methods - This custom name does not use the value attribute")
	@Test
	void shouldBeTheCorrectJUnit5Tutorial() {
		String tutorial = "JUnit 5";
		
		assertEquals("JUnit 5", tutorial);
	}
	
	@DisplayName("JUnit 5 is really Smart - It accepts emojis 😏")
	@Test
	void shouldBeTheCorrectMockitoTutorial() {
		String tutorial = "Mockito";
		
		assertEquals("Mockito", tutorial);
	}
	
}
