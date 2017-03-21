## JUnit 5 Configuration

```java
@RunWith(JUnitPlatform.class)
@SelectPackages({ "com.junit5.features" })
public class Configuration {

}
```

## Feature 1 - Default Class

In JUnit 4, the test class should be public as follows:

```java
public class DefaultPackageJUnit4Test {

	@Test
	public void shouldBeTheCorrectTutorial() {
		String tutorial = "JUnit 5";

		assertEquals("JUnit 5", tutorial);
	}

}
```

Try to remove the **public** accessor and an error will be thrown in your face:

```java
class DefaultPackageJUnit4Test {

	@Test
	public void shouldBeTheCorrectTutorial() {
		String tutorial = "JUnit 5";

		assertEquals("JUnit 5", tutorial);
	}

}
```

```bash
java.lang.Exception: The class com.craft.coder.junit4.DefaultPackageJUnit4Test is not public.
...
```

Now JUnit 5 allows us to have a default package class \o/

```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DefaultPackageJUnit5Test {

	@Test
	public void shouldBeTheCorrectTutorial() {
		String tutorial = "JUnit 5";

		assertEquals("JUnit 5", tutorial);
	}

}
```

Nice! Notice the package that has been imported! Now we're using the
**org.junit.jupiter.api.Assertions.assertEquals;** package instead of
**org.junit.Assert.assertEquals;**

## Feature 2 - Default Method

JUnit 4 forces us to have a public method:

```java
public class DefaultMethod {

	@Test
	void shouldBeTheCorrectTutorial() {
		String tutorial = "JUnit 5";

		assertEquals("JUnit 5", tutorial);
	}

}
```

Try to remove the public access and will get the following error:

```bash
java.lang.Exception: Method shouldBeTheCorrectTutorial() should be public
...
```

And of course we can have a default package class with non public method to be tested in JUnit 5

```java
class DefaultMethodTest {

	@Test
	void shouldBeTheCorrectTutorial() {
		String tutorial = "JUnit 5";

		assertEquals("JUnit 5", tutorial);
	}

}
```

## Feature 3 - Display Name

```java
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
```

## Feature 4 - Switching the Message Error

```java
@Test
public void shouldFailAndShowTheMessageError() throws Exception {
	String tutorial = "Mockito";

	assertEquals("In JUnut 4, the first parameter is the message error :(", "JUnit 5", tutorial);
}
```

In JUnit 5 the message error is the last parameter

```java
@Test
public void shouldFailAndShowTheMessageError() throws Exception {
	String tutorial = "Mockito";

	assertEquals("In JUnut 4, the first parameter is the message error :(", "JUnut 5", tutorial);
}
```

## Feature 5 - Disabling a Test

**In JUnit 4**

We used to put the @Ignore annotation in the test method

```java
@Ignore
@Test
public void shouldBeIgnored() throws Exception {
	assertEquals("Does not matter, will be ignored", "Yeh, I know");
}
```

As parameter, @Ignore annotation receives the reason the test is ignored

```java
@Ignore("I really don't know why")
@Test
public void shouldBeIgnored() throws Exception {
	assertEquals("Does not matter, will be ignored", "Yeh, I know");
}
```

**In JUnit 5**

We can use the new annotation **@Disabled**

```java
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
```
