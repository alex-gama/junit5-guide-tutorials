package com.junit4.features;

import static org.junit.Assert.*;

import org.junit.Test;

class DefaultPackageJUnit4Test {

	@Test
	public void shouldBeTheCorrectTutorial() {
		String tutorial = "JUnit 5";
		
		assertEquals("JUnit 5", tutorial);
	}
	
}
