package br.com.gejunit5.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisablingTest {

	@Disabled
	@Test
	public void shouldDisableThisTest() {
	}
	
	@Disabled(value = "Sorry about that!")
	@Test
	public void shouldDisableThisTestWithAWonderfulMessage() {
	}
	
	@Disabled(value = "Sorry about that!")
	@DisplayName("Yeh, we can have a DisplayName with Disable annotation")
	@Test
	public void shouldDisableThisTestWithAWonderfulMessageAndDisplayName() {
	}
	
}
