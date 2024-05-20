package testngsessions;

import org.testng.Assert;

//AAA rule we will follow in assertion
import org.testng.annotations.Test;

public class AssertionConcept {

	@Test
	public void searchTest() {

		String search = "macbook";
		Assert.assertEquals(search, "macbook123");

	}

	@Test
	public void sumTest() {

		int a = 10;
		int b = 20;
		int sum = a + b;
		Assert.assertEquals(sum, 30);

		// Interview question1:
		// What is the issue with if-else condition?
		// Even if the if condition doesn't pass, overall test will pass
		// Therefore, the assertion class will decide either test can pass/fail

		if (sum == 50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");

		}

	}

	@Test
	public void nameTest() {

		String usrName = "abhishek";
		// check name should not be null
		Assert.assertNotNull(usrName);

	}

	@Test

	public void isElementDisplayed() {

		String loginBtn = "loginAmazonButton";
		// check name have login in the string or not
		Assert.assertTrue(loginBtn.contains("loginAmazon"));

	}

	@Test

	public void isUserInactive() {

		boolean inactive = false;
		// check if the boolean flag is false
		Assert.assertFalse(inactive);

	}

}
