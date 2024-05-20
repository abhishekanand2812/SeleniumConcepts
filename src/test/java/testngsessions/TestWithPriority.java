package testngsessions;

import org.testng.annotations.Test;

public class TestWithPriority {

	@Test(priority = -1)
	public void searchTest() {
		System.out.println("TEST -- searchTest");

	}

	// 5
	@Test(priority = 2)
	public void addToCartTest() {
		System.out.println("TEST -- addToCartTest");

	}

	// 8
	@Test(priority = 0)
	public void paymentTest() {
		System.out.println("TEST -- paymentTest");

	}

	
	//Interview question1:-
	//Can we put 0,-1, negative numbers in priority?
	//Yes, it will take accordingly
	
	//Interview question2:-
	//Can we have a combo of non priority TC and 0,-1, negative numbers in priority?
	//Yes, first non priority TC that too alphabetically will be picked(If capital letter then first, then small letter)
	//Then negative numbers, 0 and positive no priority
	
	//Interview question3:-
	//Can we have same number in priority?
	//yes we can then alphabetically it will be executed
	
	//Interview question3:-
	//Can we have @Test without global pre and post conditions?
	//yes
}
