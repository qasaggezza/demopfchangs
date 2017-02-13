
package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class PFCreateAccount extends PFChangWrappers{

	public PFCreateAccount() {
		if(!verifyTitle("Create Account | P.F. Chang's")) ;
			//Reporter.reportStep("This is not the Create Account Page", "FAIL");
	}
	
			
	public PFCreateAccount enterEmailaddress(String data) {
		enterByName(prop.getProperty("Register.Emailaddress.name"), data);
		return this;
	}

	public PFCreateAccount enterPassword(String data) {
		enterByName(prop.getProperty("Register.Password.name"), data);
		return this;
	}
	
	public PFCreateAccount enterFirstname(String data) {
		enterByName(prop.getProperty("Register.Firstname.name"), data);
		return this;
	}
	public PFCreateAccount enterLastname(String data) {
		enterByName(prop.getProperty("Register.Lastname.name"), data);
		return this;
	}
	
	public PFCreateAccount enterPhone(String data) {
		enterByName(prop.getProperty("Register.Phone.name"), data);
		return this;
	}
	
	public PFCreateAccount enterZip(String data) {
		enterByName(prop.getProperty("Register.Zip.name"), data);
		return this;
	}
	
	public PFCreateAccount clicklogin() {
		clickByClassName(prop.getProperty("Login.login.class"));
		return this;
	}
	
	public PFCreateAccount verifyAlertmessage(String data) {
		verifyTextByXpath(prop.getProperty("Register.alerttext.XPath"), data);
		return this;
	}
	
	public PFCreateAccount verifyLoginmessage(String data) {
		verifyTextByXpath(prop.getProperty("Login.message.XPath"), data);
		return this;
	}
	
		
	public PFCreateAccount enterEmailaddresslogin(String data) {
		enterById(prop.getProperty("Login.emailaddress.id"), data);
		return this;
	}

	public PFCreateAccount enterPasswordlogin(String data) {
		enterById(prop.getProperty("Login.password.id"), data);
		return this;
	}
	
	public PFCreateAccount loginfailure() {
		clickByXpath(prop.getProperty("Login.submit.XPath"));
		return this;
	}
	
	
	public PFYourAccount clickX() {
		clickByXpath(prop.getProperty("Register.closex.XPath"));
		return new PFYourAccount();
	}
	
	public PFCreateAccount clickCreateMyAccount() throws InterruptedException {
		clickByXpath(prop.getProperty("Register.createaccount.XPath"));
		Thread.sleep(2000);
		return this;
	}

	public PFCreateAccount month(String value) {
		selectByName(prop.getProperty("Register.month.name"), value);
		return this;
	}

	public PFCreateAccount day(String value) {
		selectByName(prop.getProperty("Register.day.name"), value);
		return this;
	}
	
	public PFYourAccount clickloginSubmit() throws InterruptedException {
		clickByXpath(prop.getProperty("Login.submit.XPath"));
		return new PFYourAccount();
	}
	
	public PFYourAccount clickSubmit() throws InterruptedException {
		clickByXpath(prop.getProperty("Register.submit.XPath"));
		//Thread.sleep(4000);
		return new PFYourAccount();
}

	
	public PFCreateAccount clickLogout() {
		clickByXpath(prop.getProperty("Youraccount.logout.Xpath"));
		return this;
	}
	
	public  PFHomePage clickNotuser() throws InterruptedException {
			clickByXpath(prop.getProperty("Youraccount.notuser.XPath"));
	    	return new PFHomePage();
		}
	
	}
	
