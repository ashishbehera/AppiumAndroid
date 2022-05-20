
package practise;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import pageObjects.CheckoutPage;
import pageObjects.FormPage;
import pageObjects.ProductDetailsPage;
import utils.*;



import java.io.IOException;

public class Ecom_TC3 extends Base {

	
//	@BeforeTest
//	public void killAllNodes() throws IOException, InterruptedException
//	{
//	//taskkill /F /IM node.exe
//		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
//		Thread.sleep(3000);
//	}
	
	@Test
	public  void productCheckout() throws InterruptedException, IOException {

		startServer();
		AndroidDriver<AndroidElement> driver = capabilities("generalStore");

		FormPage fp = new FormPage(driver);
		fp.txtName.sendKeys("Hello");
		fp.hideKeyboard();
		fp.genderRadioBtn.click();
		fp.clickCountryText.click();
		Utlities utils = new Utlities(driver);
		utils.scrollToText("Argentina");
		fp.selectCountryText.click();
		fp.btnLetsShop.click();
		ProductDetailsPage pdp = new ProductDetailsPage(driver);
		pdp.cartList.get(0).click();
		pdp.cartList.get(0).click();
		pdp.btnCart.click();
		Thread.sleep(4000);
		CheckoutPage cp = new CheckoutPage(driver);
		int count = cp.productList.size();

		double sum = 0;

		for (int i = 0; i < count; i++)

		{

			String amount1 = cp.productList.get(i).getText();
			double amount = getAmount(amount1);

			sum = sum + amount;// 280.97+116.97

		}

		System.out.println(sum + "sum of products");

		String total = cp.totalAmount.getText();

		total = total.substring(1);

		double totalValue = Double.parseDouble(total);

		System.out.println(totalValue + "Total value of products");

		AssertJUnit.assertEquals(sum, totalValue);

		// Mobile Gestures

		utils.tap(cp.checkbox);
		utils.longPress(cp.termsnCond);
	
		cp.btnClose.click();
		
		cp.btnProceed.click();
		//service.stop();
		//service.stop();
		stopServer();

	}

	public static double getAmount(String value)

	{

		value = value.substring(1);

		double amount2value = Double.parseDouble(value);

		return amount2value;

	}

}