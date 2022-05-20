package stepDefinitions;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;
import pageObjects.Preferences;
import utils.Base;


//@RunWith(Cucumber.class)
public class ApiDemo extends Base {

	
	AndroidDriver<AndroidElement> driver;
	HomePage hp;
	Preferences pref;
	


	@Given("Server is started and the API Demos APP is opened")
	public void open_the_api_demos_app() throws IOException, InterruptedException {
		startServer();
		driver = capabilities("apiDemos");
	
	}
	@Given("Navigate to Preferences Tab")
	public void navigate_to_preferences_tab() {
		hp = new HomePage(driver);
		hp.Preferences.click();
		
	}
	@Given("Click on Preference Dependencies Sub-Tabs")
	public void click_on_preference_dependencies_sub_tabs() {
		pref = new Preferences(driver);
		pref.prefDependencies.click();

	}
	@Given("Click on WiFi Checkbox")
	public void click_on_wi_fi_checkbox() {
		pref.chkBox.click();

	}
	@When("Click on WiFi settings")
	public void click_on_wi_fi_settings() {
		pref.relativeLayout.click();

		
	}
	@Then("^Enter configs (.+) in WiFi Input$")
	public void enter_configs_in_wi_fi_input(String data) {
		pref.txtMessage.sendKeys(data);
	}
	
	
	@Then("Click on OK Button")
	public void click_on_ok_button() {
		pref.btnList.get(1).click();
	
	}
	
	@Then("Stop the Server")
	public void stop_the_server() {
		stopServer();
	
	}


}