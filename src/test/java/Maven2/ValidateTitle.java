package Maven2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.base;

public class ValidateTitle extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	@Test
	public void validateTitle() throws IOException{
	LandingPage l=new LandingPage(driver);
	l.getTitle().getText();
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
