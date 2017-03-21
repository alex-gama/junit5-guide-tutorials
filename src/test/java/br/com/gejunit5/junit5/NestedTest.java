package br.com.gejunit5.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A Stack")
public class NestedTest {

	Stack<Object> stack;
	
	@Test
	@DisplayName("is instantiated with new Stack()")
	void isInstantiatedWithNew() {
		new Stack<>();
	}
	
	@DisplayName("when new")
	class WhenNew {
		
		@BeforeEach
		void createNewStack() {
			stack = new Stack<>();
		}
		
		@Test
		@DisplayName("is empty")
		void isEmpty() {
			assertTrue(stack.isEmpty());
		}
	}
	
}
