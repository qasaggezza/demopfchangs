package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class MainMenu extends PFChangWrappers{

	public MainMenu() {
		if(!verifyTitle("Street Fare | Main Menu | Keystone | P.F. Chang's"));
		//Reporter.reportStep("This is not Your Menu and Order Page", "FAIL");
	}


	public MainMenu clickStreetfare1(){
		clickByXpath(prop.getProperty("MainMenu.StreetFare1.XPath"));
		return this;
	}
	public MainMenu clickyouroption(){
		clickByXpath(prop.getProperty("MainMenu.chooseyourOption.xpath"));
		return this;
	}
	
	public MainMenu clickStreetfare2(){
		clickByXpath(prop.getProperty("MainMenu.StreetFare2.XPath"));
		return this;
	}
	public MainMenu clickStreetfare3(){
		clickByXpath(prop.getProperty("MainMenu.StreetFare3.XPath"));
		return this;
	}
	public MainMenu clickStreetfare4(){
		clickByXpath(prop.getProperty("MainMenu.StreetFare4.XPath"));
		return this;
	}
	
	public MainMenu clickStreetfare5(){
		clickByXpath(prop.getProperty("MainMenu.StreetFare5.XPath"));
		return this;
	}


	public MainMenu enterQuantity(String data) {
		enterByXpath(prop.getProperty("MainMenu.Quantity.XPath"), data);
		return this;
	}


	public MainMenu clickAddtoOrder() throws InterruptedException{
		clickByXpath(prop.getProperty("MainMenu.AddtoOrder.XPath"));
		Thread.sleep(1000);
		return this;
	}

	public OrderSummary clickCheckout() {
		clickByXpath(prop.getProperty("MainMenu.Checkout.XPath"));
		return new OrderSummary();
	}

	public MainMenu clickKeeplooking() throws InterruptedException{
		clickByXpath(prop.getProperty("MainMenu.Keeplooking.XPath"));
	Thread.sleep(1000);
		return this;
	}
	

}
