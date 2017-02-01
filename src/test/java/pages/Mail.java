package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
/**
 * @author Muthuraman
 *
 */
public class Mail extends PFChangWrappers{

	public Mail() {
		if(!verifyTitle("Saggezza, Inc. Mail"));
		//Reporter.reportStep("This is not your mail page", "FAIL");
	}

	public Mail enterSearch(String data) throws InterruptedException {
		//enterByXpath(prop.getProperty("Mail.Searchtext.Xpath"), data);
		enterById(prop.getProperty("Mail.Searchtext.id"), data);
		Thread.sleep(2000);
		return this;
	}	

	public Mail clickSearchicon() {
		//clickByXpath(prop.getProperty("Mail.Searchicon.Xpath"));
		clickById(prop.getProperty("Mail.Searchicon.id"));
		return this;
	}

	public Mail clickSubject()  {
		//clickByXpath(prop.getProperty("Mail.Subject.Xpath"));
		clickById(prop.getProperty("Mail.Subject.id"));
		return this;
	}
	
	public Mail clickThread() {
		//clickByXpath(prop.getProperty("Mail.Subject.Xpath"));
		clickById(prop.getProperty("Mail.Thread.Xpath"));
		return this;
	}
	
	public Mail clickGoogleAccount() {
		clickByXpath(prop.getProperty("Mail.GoogleAccount.Xpath"));
		return this;
	}

	public GoogleAccounts clickSignOut() {
		clickById(prop.getProperty("Mail.SignOut.id"));
		return new GoogleAccounts();
	}

	public Mail verifycontent(String data) {
		verifyTextContainsByXpath(prop.getProperty("Mail.Content.Xpath"), data);
		return this;
	}

}
