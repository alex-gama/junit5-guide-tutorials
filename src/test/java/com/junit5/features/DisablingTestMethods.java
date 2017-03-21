package com.junit5.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisablingTestMethods {

	@Disabled("I really don't remember ☺️️")
	@Test
	public void shouldBeDisabled() throws Exception {
		assertEquals("Does not matter again", "Yeh, again!");
	}
	
	@Test
	public void shouldRunNormally() throws Exception {
		String tutorial = "JUnit 5";
		
		assertEquals("JUnit 5", tutorial);
	}
	
}
