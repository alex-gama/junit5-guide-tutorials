package br.com.gejunit5.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PackageVisibilityClassAndMethodTest {

	@Test
	void shouldRunEvenWeUseDefaultPackageVisibility() {
		String awesomeName = "Craft Coder";

		Assertions.assertEquals("Craft Coder", awesomeName);
	}

	@Test
	void shouldRunEvenWeUseDefaultPackageMethodUsingAssert() {
		String awesomeName = "Craft Coder";

		Assert.assertEquals("Craft Coder", awesomeName);
	}

	@Test
	void shouldPrintTheErrorMessageIfTheTestFails() {
		String awesomeName = "Craft Coder";

		// Yes, the error message is in the last parameter in JUnit 5
		Assertions.assertEquals("Craft Coder - JUnit5", awesomeName, "Almost right man!");
	}

	@Test
	void shouldPrintTheErrorMessageIfTheTestFailsUsingAssert() {
		String awesomeName = "Craft Coder";

		// As you know, the error message is in the first parameter in JUnit 4
		Assert.assertEquals("Almost right man!", "Craft Coder - JUnit5", awesomeName);
	}

	@DisplayName("JUnit 5 - This will no longer run because the name is wrong")
	@Test
	void shouldPrintTheErrorMessageIfTheTestFailsAndDisplaySomething() {
		String awesomeName = "Craft Coder";

		// Yes, the error message is in the last parameter in JUnit 5
		Assertions.assertEquals("Craft Coder - JUnit5", awesomeName, "Almost right man!");
	}

}
