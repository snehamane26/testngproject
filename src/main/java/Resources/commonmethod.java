package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonmethod {
	
	public static void selectdropdown(WebElement element,int index) {
		
		Select s=new Select(element);
	    s.selectByIndex(index);
		
		
	}
	
	public static void handleassertion(String actual,String expected,String message) {
		
		SoftAssert a=new SoftAssert();
		String ac=actual;
		
		String exp=expected;
		
		a.assertEquals(ac, exp,message);
		a.assertAll();
		
		
	}

}
