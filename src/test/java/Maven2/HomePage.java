package Maven2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ForgotPassword;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
	}
	@Test(dataProvider="getData")
	public void basePageNavigationBar(String Username, String Password)throws IOException  {
		driver.get("http://automationpractice.com/index.php");
		LandingPage l=new LandingPage(driver);
		LoginPage lp=l.getlogin();
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
		ForgotPassword fp=lp.forgotPassword();
		fp.getEmail().sendKeys("def");
		fp.sendMeInstructions().click();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[2][2];
		data[0][0]="abc";
		data[0][1]="password";
		
		data[1][0]="ghim";
		data[1][1]="password";
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
