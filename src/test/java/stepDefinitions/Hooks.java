package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@smokeTestAmazonLogin")
	public void beforeValidation() {
		System.out.println("Before Mobile Test");
	}
	

	@After("@mobileTest")
	public void afterValidation() {
		System.out.println("After Mobile Test");
	}

}
