package MavenPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class ClearTripPage {

	WebDriver wd;
	By fromLoc=By.xpath("//input[@id='FromTag']");
	By toLoc=By.xpath("//input[@id='ToTag']");
	By searchLoc=By.xpath(".//*[@id='SearchBtn']");
	By knowMoreLoc=By.xpath("//ul[@class='listView flights']/li[1]//a[text()='Know more']");
	By cross=By.xpath("//div[@id='errors']//ol");
	By calenderLoc=By.xpath("//div[@id='ORtrip']//a[@class='calendarIcon']//i");
	By dateLoc=By.xpath("//div[@class='monthBlock last']//tr[1]/td[6]");
	By searchAgainLoc=By.xpath("//form[@id='AirSearch']//button[@class='orange']");
By errorLoc=By.xpath("//div[@id='errors']//ol");
	By frameLoc=By.xpath("//iframe[@class='iframe-hotel-search']");

	public ClearTripPage(WebDriver wd){
		this.wd=wd;
	}
	public boolean checkRadionButton1()

	{
		return	wd.findElement(By.xpath("//nav[@class='row fieldRow tripType']//li[1]//input")).isSelected();
		

	}
	public boolean checkRadionButton2()

	{
		return	wd.findElement(By.xpath("//nav[@class='row fieldRow tripType']//li[2]//input")).isSelected();
		

	}
	
	public boolean checkRadionButton3()

	{
		return	wd.findElement(By.xpath("//nav[@class='row fieldRow tripType']//li[3]//input")).isSelected();
		

	}
	
	public boolean checkRadionButton4()

	{
		return	wd.findElement(By.xpath("//nav[@class='row fieldRow tripType']//li[4]//input")).isSelected();
		

	}
	public void from() throws InterruptedException
	{
		wd.findElement(fromLoc).sendKeys("Delhi",Keys.TAB.ENTER);
		wd.findElement(toLoc).sendKeys("Jaipur",Keys.TAB.ENTER);
		wd.findElement(calenderLoc).click();
		wd.findElement(dateLoc).click();
		wd.findElement(searchLoc).click();

		Thread.sleep(5000);

	}
	public void  knowMore()
	{ wd.findElement(knowMoreLoc).click();
	String Parent=wd.getWindowHandle();
	Set <String> All=wd.getWindowHandles();
	for(String s:All){
		if(s.equals(Parent)==false)
		{
			wd.switchTo().window(s);
			break;

		}

	}
	}


	public boolean checkTitle(){

		return	wd.getCurrentUrl().contains("special-offer");
	}

	public void method() throws InterruptedException{

		Thread.sleep(5000);
	}


	public void searchAgain(){
		//wd.findElement(IF).click();

		wd.switchTo().frame(wd.findElement(frameLoc));
		wd.findElement(searchAgainLoc).click();
		String s=wd.findElement(errorLoc).getText();
		System.out.println(s);


	}


}


