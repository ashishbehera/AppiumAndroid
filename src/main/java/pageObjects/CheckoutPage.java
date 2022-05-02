package pageObjects;

import java.lang.reflect.Field;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutPage {
	
	AndroidDriver<AndroidElement> driver;
	
	public CheckoutPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productPrice")
	public List<WebElement> productList;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
	public WebElement totalAmount;
    
	@AndroidFindBy(className="android.widget.CheckBox")
	public WebElement checkbox;
	
	
	@AndroidFindBy(xpath="//*[@text='Please read our terms of conditions']")
	public WebElement termsnCond;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement btnClose;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
	public WebElement btnProceed;
	
	
	

}
