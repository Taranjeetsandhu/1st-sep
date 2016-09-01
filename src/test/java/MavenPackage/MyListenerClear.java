package MavenPackage;






import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class MyListenerClear implements ITestListener {
WebDriver driver;

public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestFailure(ITestResult arg0) {
	//File file=((TakesScreenshot)(ClearTest.driver)).getScreenshotAs(OutputType.FILE);
	File file=((TakesScreenshot)(ClearTest.driver)).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file,new File("E:/t2.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

}