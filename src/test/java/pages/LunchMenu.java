package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class LunchMenu extends PFChangWrappers{

	public LunchMenu() {
		if(!verifyTitle("Lunch Pairings | Lunch Menu | Keystone | P.F. Chang's"));
			//Reporter.reportStep("This is not Your Menu and Order Page", "FAIL");
		}
	
	public LunchMenu clickLunchPairings(){
		clickByXpath(prop.getProperty("LunchMenu.LunchPairings.XPath"));
		return this;
	}
	
	public LunchMenu clickPairings1(){
		clickByXpath(prop.getProperty("LunchMenu.Pairings1.XPath"));
		return this;
	}
	public LunchMenu clickPairings4(){
		clickByXpath(prop.getProperty("LunchMenu.Pairings4.XPath"));
		return this;
	}

	public LunchMenu clickPairings2(){
		clickByXpath(prop.getProperty("LunchMenu.Pairings2.XPath"));
		return this;
	}
	
	public LunchMenu clickPairings3(){
		clickByXpath(prop.getProperty("LunchMenu.Pairings3.XPath"));
		return this;
	}
	
	public LunchMenu clickPairings5(){
		clickByXpath(prop.getProperty("LunchMenu.Pairings5.XPath"));
		return this;
	}
	
	public LunchMenu clickPairings6(){
		clickByXpath(prop.getProperty("LunchMenu.Pairings6.XPath"));
		return this;
	}
	
	public LunchMenu clickPairings7(){
		clickByXpath(prop.getProperty("LunchMenu.Pairings7.XPath"));
		return this;
	}
	public LunchMenu enterQuantity(String data) {
		enterByXpath(prop.getProperty("LunchMenu.Quantity.XPath"), data);
		return this;
	}
	
	public LunchMenu clickChoice1(){
		clickByXpath(prop.getProperty("LunchMenu.choice1.XPath"));
		return this;
	}
	
	public LunchMenu clickChoice2(){
		clickByXpath(prop.getProperty("LunchMenu.choice2.XPath"));
		return this;
	}
	public LunchMenu clickChoice3(){
		clickByXpath(prop.getProperty("LunchMenu.choice3.XPath"));
		return this;
	}
	public LunchMenu clickChoice5(){
		clickByXpath(prop.getProperty("LunchMenu.choice5.XPath"));
		return this;
	}
	public LunchMenu clickChoice6(){
		clickByXpath(prop.getProperty("LunchMenu.choice6.XPath"));
		return this;
	}
	public LunchMenu clickChoice7(){
		clickByXpath(prop.getProperty("LunchMenu.choice7.XPath"));
		return this;
	}
	
	public LunchMenu clickradio1(){
		clickByXpath(prop.getProperty("LunchMenu.radio1.XPath"));
		return this;
	}
	
	public LunchMenu clickradio2(){
		clickByXpath(prop.getProperty("LunchMenu.radio2.XPath"));
		return this;
	}
	public LunchMenu clickChoice4(){
		clickByXpath(prop.getProperty("LunchMenu.choice4.XPath"));
		return this;
	}
	public LunchMenu clickAddtoOrder() throws InterruptedException{
		clickByXpath(prop.getProperty("LunchMenu.AddtoOrder.XPath"));
		Thread.sleep(1000);
		return this;
	}
	
	public OrderSummary clickCheckout() {
		clickByXpath(prop.getProperty("LunchMenu.Checkout.XPath"));
		return new OrderSummary();
	}
}
