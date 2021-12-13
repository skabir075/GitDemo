package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By email=By.cssSelector("[id='email']");
	By password=By.cssSelector("[type='password']");
	By login=By.cssSelector("[type='submit']");
	//By forgotPassword=By.cssSelector("a[href*='?controller=password']");
	By forgotPassword=By.xpath("//a[contains(text(),'Forgot your password?')]");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmail(){
		return driver.findElement(email);
	}
	public WebElement getPassword(){
		return driver.findElement(password);
	}
	public WebElement getLogin(){
		return driver.findElement(login);
	}
	public ForgotPassword forgotPassword() {
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
	}
}
