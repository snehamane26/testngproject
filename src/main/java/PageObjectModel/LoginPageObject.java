package PageObjectModel;
//new commnet added

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By enterusername=By.xpath("//input[@name='username']");// xpath tayar kela 
	
	private By enterpassword=By.xpath("//input[@name='pw']");
	
	private By login=By.xpath("//input[@name='Login']");
	
	private By TryforFree=By.xpath("//a[@id='signup_link']");
	
	private By error=By.xpath("//div[@id='error']");
	
	public LoginPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	public WebElement username() {  // naav same nahi pahije 
		
		return driver.findElement(enterusername);
	}
	public WebElement password() {
		
		return driver.findElement(enterpassword);
	}
	public WebElement clicklogin() {
		
		return driver.findElement(login);
	}
	public WebElement tryfree() {
		
		return driver.findElement(TryforFree);
	}
	
	public WebElement texterror() {
		
		return driver.findElement(error);
	}

}
