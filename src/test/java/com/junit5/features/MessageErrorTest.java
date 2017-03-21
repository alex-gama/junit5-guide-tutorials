package com.junit5.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MessageErrorTest {

	@Disabled
	@Test
	public void shouldFailAndShowTheMessageError() throws Exception {
		String tutorial = "Mockito";
		
		assertEquals("In JUnut 4, the first parameter is the message error :(", "JUnut 5", tutorial);
	}

	
}
