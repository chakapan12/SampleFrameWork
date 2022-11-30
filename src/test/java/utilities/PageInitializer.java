package utilities;

import pages.CommonPage;
import pages.HomePage;

public class PageInitializer extends BaseClass {

	public static CommonPage cp;
	public static HomePage hp;

	public static void initialize() {
		cp = new CommonPage();
		hp = new HomePage();

	}

}
