package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void homePageTest() {
		System.out.println("home page test");
		int i = 9 / 0;
		// it will fail homePageTest() and skip the rest 2 dependent TCs

	}

	@Test(dependsOnMethods = "homePageTest")
	public void searchPageTest() {
		System.out.println("search page test");

	}

	@Test(dependsOnMethods = "searchPageTest")

	public void cartTest() {
		System.out.println("cart page test");

	}

	// AAA Rule- Arrange, act and assertion

	// Arrange:
	// TCs should be independent-- we should never be dependent
	// Problem1:
	// Suppose 50 TCs are dependent on homePageTest , and homePageTest is failed
	// then 50 TCs will be skipped

	// CRUD operations:
	// Create testcase for user- Create a new user --> Assert

	// getUserTest- create a user , and then get the same user ---> Assert

	// updateUserTest- create a user , and then get the same user and then update
	// the user --->Assert

	// deleteUser - create a user , and then get the same user and then delete the
	// user --->Assert

	// Problem1:
	// In parallel execution, suppose there are 3 threads , then 3 TCs are
	// dependent, then it will have to wait for the execution of homePageTest
	// so it will have a deadlock condition

}
