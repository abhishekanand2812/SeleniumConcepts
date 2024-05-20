package seleniumsessions;

/**
 * 
 * @author abhishekanand
 *
 */

public class Verify {
	
	/**
	 * This method is used to compare two different string values, mostly for actual and expect conditions comparison
	 * @param actResult
	 * @param expResult
	 * @return boolean
	 */

	public static boolean equalValues(String actResult, String expResult) {
		if (actResult.equals(expResult)) {
			System.out.println(actResult + " is equal to " + expResult);
			return true;
		} else {
			System.out.println(actResult + " is not equal to " + expResult);
			return false;
		}

	}
	
	/**
	 * This method is used to check two different string values  containing some values comparison, mostly for actual and expect conditions 
	 * @param actResult
	 * @param expResult
	 * @return boolean
	 */

	public static boolean containValues(String actResult, String expResult) {
		if (actResult.contains(expResult)) {
			System.out.println(actResult + " contains " + expResult);

			return true;
		} else {
			System.out.println(actResult + " does not contains " + expResult);
			return false;
		}

	}

}