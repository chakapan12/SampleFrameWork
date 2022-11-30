package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethod;

@Listeners(utilities.ListenerTestNG.class)
public class TestSample extends CommonMethod {

	@Test(enabled = true, priority = 1, retryAnalyzer = utilities.RetryAnalyzer.class)
	public void logIn() {
		
	}
	
	

}
