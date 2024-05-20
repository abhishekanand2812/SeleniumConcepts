package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {

	// testNG/jUnit(developer oriented) - java
	// python - pytest
	// nUnit - c#
	// phpUnit - php
	// Jasmine/moca with chai library - JavaScript

	@Test(expectedExceptions = ArithmeticException.class)
	public void homePageTest() {
		System.out.println("home page test");
		int i = 9 / 0;
		// it will pass as expectedExceptions = ArithmeticException.class is written
		// if you write expectedExceptions = ArithmeticException.class and in method
		// body, you dont i = 9 / 0;then testcase will fail

	}

}
