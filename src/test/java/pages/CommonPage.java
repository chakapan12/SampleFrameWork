package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CommonPage {

	public CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
