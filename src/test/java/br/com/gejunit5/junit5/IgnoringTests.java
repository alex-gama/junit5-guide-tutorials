package br.com.gejunit5.junit5;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoringTests {

	@Ignore
	@Test
	public void shouldIgnoreThisTest() {
	}

}
