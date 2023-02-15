package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject1 {
	
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	
	private By Password=By.xpath("//input[@id='password']");
	
	private By login=By.xpath("//input[@id='Login']");
	
	
	public LoginPageObject1(WebDriver driver2) {
		
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	
	public WebElement enterUsername() {
		
		return driver.findElement(username);	
	}
	public WebElement enterPassword() {
		
		return driver.findElement(Password);
	}
	public WebElement ClickLogin() {
		
		return driver.findElement(login);
		
				
	}
}

