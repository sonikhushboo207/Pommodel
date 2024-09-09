package PageTests;

import org.testng.annotations.Test;

import PageLocators.Page2Locators;

public class Page2Tests {
	
	@Test
	public void logoutFromApplication()
	{
		Page2Locators page2= new Page2Locators();
		page2.logoutFromApplication();
	}

}
