package practise;

import java.io.IOException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.Preferences;
import utils.Base;

public class ApiDemo extends Base {

	@Test(alwaysRun=true,dataProvider = "getData", dataProviderClass = TestData.class)
	public  void viewPreferences(String input) throws IOException, InterruptedException {
		startServer();
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("apiDemos");
	
		HomePage hp = new HomePage(driver);
		hp.Preferences.click();
		Preferences pref = new Preferences(driver);
		pref.prefDependencies.click();
		pref.chkBox.click();
		pref.relativeLayout.click();
		pref.txtMessage.sendKeys(input);
		pref.btnList.get(1).click();
		stopServer();
	}

}
