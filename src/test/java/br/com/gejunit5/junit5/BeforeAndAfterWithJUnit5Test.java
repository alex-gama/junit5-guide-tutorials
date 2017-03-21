package br.com.gejunit5.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAndAfterWithJUnit5Test {

	@BeforeAll
	static void executeOnceBeforeTheClassTest() {
		System.out.println("BeforeAll - Executing once before the Class test\n");
	}
	
	@BeforeEach
	void executeBeforeEachTest() {
		System.out.println("BeforeEach - Executing before each test");
	}
	
	@Test
	void firstTest() {
		System.out.println("First test being executed\n");
	}
	
	@Test
	void secondTest() {
		System.out.println("Second test being executed\n");
	}
	
	@AfterEach
	void executeAfterEachTest() {
		System.out.println("AfterEach - Executing after all tests run\n");
	}
	
	@AfterAll
	static void executeOnceAfterTheClassTest() {
		System.out.println("AfterAll - Executing after all tests run");
	}
	
}
