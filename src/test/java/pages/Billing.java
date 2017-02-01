package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class Billing extends PFChangWrappers{

	public Billing() {
		if(!verifyTitle("Billing  | Order Online | P.F. Chang's"));
			//Reporter.reportStep("This is not dYour Menu and Order Page", "FAIL");
		}

	public Billing EnterOrderdate(String data) {
		enterByXpath(prop.getProperty("TakeOut.Date.XPath"), data);
		return this;
	}

	public Billing ClickLocation() {
		clickByXpath(prop.getProperty("TakeOut.Location.XPath"));
		return this;
	}
	
	
	public Billing selectOrdertime(String value) {
		selectByXpath (prop.getProperty("TakeOut.Time.XPath"), value);
		return this;
	}

	
	public MenuAndOrder clickCancelOrder() {
		clickByXpath(prop.getProperty("TakeOut.CancelOrder.XPath"));
		return new MenuAndOrder();
	}
	
	public MenuAndOrder clickPlaceOrder() {
		clickByXpath(prop.getProperty("TakeOut.PlaceOrder.XPath"));
		return new MenuAndOrder();
	}
	
	
}
