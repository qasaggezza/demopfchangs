package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class MenuAndOrder extends PFChangWrappers{

	public MenuAndOrder() {
		if(!verifyTitle("Chinese Food Menu | Asian Cuisine Menu | Scratch Kitchen | P.F. Chang's"));
			//Reporter.reportStep("This is not Your Menu and Order Page", "FAIL");
		}
	public MainMenu clickMainMenu() {
		clickByXpath(prop.getProperty("MenuandOrder.MainMenu.XPath"));
		return new MainMenu();
		
	}
	
	public LunchMenu clickLunchMenu() {
		clickByXpath(prop.getProperty("MenuandOrder.LunchMenu.XPath"));
				return new LunchMenu();
	}
	
	
	public MenuAndOrder Closebrowser() {
		quitBrowser();
				return this;
	}
	
		
	public Gmail InvokeGmail(String data) {
		invokeGmail(browserName);
		return new Gmail();
	
	}
	

	
}
