package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
/**
 * @author Muthuraman
 *
 */
public class Gmail extends PFChangWrappers{

	public Gmail() {
		if(!verifyTitle("Gmail"));
			//Reporter.reportStep("This is not gmail login page", "FAIL");
	}
	
	
	public Gmail enterEmail(String data) {
		enterById(prop.getProperty("Gmail.Email.id"), data);
		return this;
	}
	
	public Gmail clickNextbutton() throws InterruptedException {
		clickById(prop.getProperty("Gmail.Nextbutton.id"));
		Thread.sleep(1000);
		return this;
	}
	
	
		 public Gmail enterPassword(String data) {
			enterById(prop.getProperty("Gmail.Password.id"), data);
			return this;
		}	
	
		 public Mail clicksignIn() {
				clickById(prop.getProperty("Gmail.signIn.id"));
				return new Mail();
			}
		 
	
}
