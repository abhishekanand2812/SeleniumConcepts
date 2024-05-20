package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	//UseCase:-
	//

	@Test(invocationCount=10)
	public void homePageTest() {
		System.out.println("home page test");

	}

}
