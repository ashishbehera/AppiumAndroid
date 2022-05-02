package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class Utlities {

	AndroidDriver<AndroidElement> driver;

	public Utlities(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void scrollToText(String text) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");

	}

	public void tap(WebElement element) {
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(element))).perform();
	}
	
	public void longPress(WebElement element) {
		TouchAction t = new TouchAction(driver);
		 t.longPress(longPressOptions().withElement(element(element)).withDuration(ofSeconds(2))).release().perform();
	}

}
