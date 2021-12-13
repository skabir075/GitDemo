package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By signin=By.cssSelector("[class='login']");
	By title=By.xpath("//img[@class='logo img-responsive']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	public LoginPage getlogin() {
		// TODO Auto-generated method stub
		driver.findElement(signin).click();
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	public WebElement getTitle(){
		return driver.findElement(title);
	}
	}

