package stepDefinitions;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FormPage;
import utils.Base;
import utils.Utlities;

public class GeneralStoreProductCheckout extends Base {
	AndroidDriver<AndroidElement> driver;
	FormPage fp;
	Utlities utils;
	
	@Given("Server is started and the General Store APP is opened")
	public void server_is_started_and_the_general_store_app_is_opened() throws IOException, InterruptedException {
		startServer();
		driver = capabilities("generalStore");

	}
	@Given("^Select Country (.+) on APP home page$")
	public void select_country_on_app_home_page(String countryName) {
		fp = new FormPage(driver);
		fp.clickCountryText.click();
		utils = new Utlities(driver);
		utils.scrollToText(countryName);
		fp.selectCountryText.click();

	}
	@Given("^Enter User Name (.+)$")
	public void enter_user_name_user_name(String userName) {
		fp.txtName.sendKeys(userName);
		fp.hideKeyboard();
	
	}
	@Given("Slect User Gender")
	public void slect_user_gender() {
		fp.genderRadioBtn.click();

	}
	@When("Click on Let's Shop Button")
	public void click_on_let_s_shop_button() {
		fp.btnLetsShop.click();

	}
	@Then("User lands on Product Listing Page")
	public void user_lands_on_product_listing_page() {

	}


}
