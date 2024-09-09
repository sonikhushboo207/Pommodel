package PageTests;

import org.testng.annotations.Test;

import PageLocators.Page1Locators;

public class Page1Tests {
	@Test
	public void LoginToPage1WithValidUsernameAndValidPassword()
	{
		Page1Locators page1= new Page1Locators();
		page1.loginToApp("Admin", "admin123");
}
}
