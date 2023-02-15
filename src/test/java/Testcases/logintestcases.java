package Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.baseclass;
import Resources.commonmethod;
import Resources.constant;

public class logintestcases extends baseclass {
	
	@Test(dataProvider="testData")
	
	public void login(String usname,String password) throws IOException {
		
		
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		obj.username().sendKeys(usname);
		
		obj.password().sendKeys(password);
		
		obj.clicklogin().click();
		
		obj.tryfree().click();
		
		obj.texterror().getText();
		
		
		commonmethod.handleassertion(obj.texterror().getText(), constant.expected,constant.error);
		
		
	}
	@DataProvider
	
	public Object[][]testData(){
		
		Object[][]data=new Object[2][2];
		
		data[0][0]=constant.username1;
		data[0][1]=constant.password1;
		data[1][0]=constant.username2;
		data[1][1]=constant.password2;
		return data;
	}
	
	
	


}
