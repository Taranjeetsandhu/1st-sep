package MavenPackage;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

@Listeners(MyListenerClear.class)
public class ClearTest {

	public static TakesScreenshot driver;

	WebDriver wd=new FirefoxDriver();

	ClearTripPage cp=new ClearTripPage (wd);

	@Test
	public void test() throws InterruptedException{
		wd.manage().window().maximize();
		wd.get("https://www.cleartrip.com/");		
		cp.from();
		cp.knowMore();
		cp.method();
		cp.searchAgain();
		Assert.assertTrue( cp.checkRadionButton1(),"Button is disabled");
		Assert.assertFalse(cp.checkRadionButton2(), "message2");
		Assert.assertFalse(cp.checkRadionButton3(), "message3");
		Assert.assertFalse(cp.checkRadionButton4(), "message4");
		//Assert.assertEquals("URL mismatched", "http://www.cleartrip.com/offers/india/special-offer", cp.checkTitle());
	}

}
