package MavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ByeTest {
	@Test
	public void method(){
		WebDriver wd=new FirefoxDriver();
		wd.get("https://in.yahoo.com/?p=us");
	}
}
