package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	public WebDriver driver;
	
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	
	private By lastname=By.xpath("//input[@name='UserLastName']");
	
	private By mail=By.xpath("//input[@name='UserEmail']");
	
	private By number=By.xpath("//input[@name='UserPhone']");
	
	private By comp=By.xpath("//input[@name='CompanyName']");
	
	private By emp=By.xpath("//select[@name='CompanyEmployees']");
	
	private By cont=By.xpath("//select[@name='CompanyCountry']");
	
	public SignupPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	public WebElement finame() {
		
		return driver.findElement(firstname);
	}
	public WebElement laname() {
		
		return driver.findElement(lastname);
	}
	public WebElement gmail() {
		
		return driver.findElement(mail);
	}
	public WebElement contact() {
		
		return driver.findElement(cont);
	}
	public WebElement compa() {
		return driver.findElement(comp);
	}
	public WebElement empl() {
		
		return driver.findElement(emp);
	}
	public WebElement contr() {
		
		return driver.findElement(cont);
	}

}
