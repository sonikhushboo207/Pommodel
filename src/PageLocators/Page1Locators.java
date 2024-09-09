package PageLocators;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageTests.BaseTest;

public class Page1Locators {
	
	@FindBy(name="username")
	WebElement usernametext;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement loginbtn;
	
	public Page1Locators(){
	
	PageFactory.initElements(BaseTest.driver, this);
			
	}
	
	public void loginToApp(String userName, String passWord)
	{
		usernametext.sendKeys(userName);
		password.sendKeys(passWord);
	}
	
			

}
