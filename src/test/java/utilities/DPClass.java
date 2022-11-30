package utilities;

import java.util.Locale;

import org.testng.annotations.DataProvider;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class DPClass {
	
	static FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
	static String email = fakeValuesService.bothify("????##@gmail.com");
	
	
	@DataProvider(name = "data")
  	public static Object[][] dataProvRegistration(){
        	return new Object[][]{{}};
        		
        	}
   
}
	
	
