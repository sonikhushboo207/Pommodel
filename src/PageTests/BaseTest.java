package PageTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	
	public static WebDriver driver;
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeWebDriver\\chromedriver-win64\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

}
}
