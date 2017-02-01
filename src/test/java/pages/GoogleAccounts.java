package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
/**
 * @author Muthuraman
 *
 */
public class GoogleAccounts extends PFChangWrappers{

	public GoogleAccounts() {
		if(!verifyTitle("Google Accounts"));
			//Reporter.reportStep("This is not Google Accounts Page", "FAIL");
	}
	
		public Gmail clickEmailid() {
		clickByXpath(prop.getProperty("Google.account.Xpath"));
		return new Gmail();
	}
	
}
	

