package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class OrderSummary extends PFChangWrappers{

	public OrderSummary() {
		if(!verifyTitle("Extras | Menu | P.F. Chang's"));
			//Reporter.reportStep("This is not Your Menu and Order Page", "FAIL");
		}

	public OrderSummary enterChopsticks(String data) {
		enterByXpath(prop.getProperty("OrderSummary.chopsticks.XPath"), data);
		return this;
	}

	
	public OrderSummary enterPlates(String data) {
		enterByXpath(prop.getProperty("OrderSummary.Plates.XPath"), data);
		return this;
	}
	
	public OrderSummary enterGlutenFreeSoySauce(String data) {
		enterByXpath(prop.getProperty("OrderSummary.Gluten.XPath"), data);
		return this;
	}
	
		
	public OrderSummary clickAdd1(){
		clickByXpath(prop.getProperty("OrderSummary.add1.XPath"));
		return this;
	}

	public OrderSummary clickAdd2(){
		clickByXpath(prop.getProperty("OrderSummary.add2.XPath"));
		return this;
	}
	
	public OrderSummary clickAdd5(){
		clickByXpath(prop.getProperty("OrderSummary.add5.XPath"));
		return this;
	}
	
	public OrderSummary enterPlasticware(String data) {
		enterByXpath(prop.getProperty("OrderSummary.Plasticware.XPath"), data);
		return this;
	}

	public OrderSummary clickAdd3(){
		clickByXpath(prop.getProperty("OrderSummary.add3.XPath"));
		return this;
	}

	public OrderSummary enterHotMustart(String data) {
		enterByXpath(prop.getProperty("OrderSummary.HotMustart.XPath"), data);
		return this;
	}

	public OrderSummary clickAdd6(){
		clickByXpath(prop.getProperty("OrderSummary.add6.XPath"));
		return this;
	}
	
	public Billing clickCheckout() {
		clickByXpath(prop.getProperty("OrderSummary.Checkout.XPath"));
		return new Billing();
	}
	
	public MenuAndOrder clickAddmoreItems() {
		clickByXpath(prop.getProperty("OrderSummary.Addmore.XPath"));
		return new MenuAndOrder();
		
		}
	
	
	}
