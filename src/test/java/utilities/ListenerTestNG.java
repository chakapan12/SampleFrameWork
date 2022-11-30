package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		CommonMethod.takeScreenshot("FailCase");
	}

	public void onTestSkipped(ITestResult result) {
	
	}
	
	


	
	

}
