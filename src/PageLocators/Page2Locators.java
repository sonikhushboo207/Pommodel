package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageTests.BaseTest;

public class Page2Locators {
	
	@FindBy(xpath="//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")
	WebElement adminLink;
	
	@FindBy(xpath="//img[@alt=\"client brand logo\"]")
	WebElement profileImage;
	
	@FindBy(xpath="//a[@class=\"oxd-userdropdown-link\"]")
	WebElement logoutLink;
	
	public Page2Locators()
	{
		PageFactory.initElements(BaseTest.driver, this);

}
	
	public void clickOnAdminLink()
	{
	adminLink.click();
	}
	
	public void logoutFromApplication() 
	{
		profileImage.click();
		logoutLink.click();
    }
}
