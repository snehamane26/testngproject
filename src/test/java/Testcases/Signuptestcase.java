package Testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.baseclass;
import Resources.commonmethod;
import Resources.constant;

public class Signuptestcase extends baseclass {
	
	@Test
	public void signup() throws IOException, InterruptedException {
		
		
		LoginPageObject lpo=new LoginPageObject(driver);
		lpo.tryfree().click();
		
		
		

		
		SignupPageObject spo=new SignupPageObject(driver);
		
		Thread.sleep(5000);
		
		spo.finame().sendKeys(constant.firstname);
		
		spo.laname().sendKeys(constant.lastname);
		
		spo.gmail().sendKeys(constant.mail);
		Thread.sleep(2000);
		
		spo.contact().sendKeys(constant.contact);
		
		spo.compa().sendKeys(constant.company);
		
		
		Thread.sleep(4000);
		
		commonmethod.selectdropdown(spo.empl(), 2);
		
		commonmethod.selectdropdown(spo.contr(), 2);
	}
	

}
