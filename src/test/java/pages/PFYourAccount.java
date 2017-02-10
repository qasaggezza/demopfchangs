package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class PFYourAccount extends PFChangWrappers{

	public PFYourAccount() {
		if(!verifyTitle("Your Account | P.F. Chang's"));
			//Reporter.reportStep("This is not Your Account Page", "FAIL");
		}

	public PFYourAccount verifyEmailid(String data) {
		verifyTextByXpath(prop.getProperty("Youraccount.emailid.XPath"), data);
		return this;
	}
	
	public PFReservation MakeReservation() {
		clickByXpath(prop.getProperty("home.reservations.xpath"));
		return new PFReservation();
	}
	
	
	public MenuAndOrder ClickMenuandOrder() {
		clickByXpath(prop.getProperty("Youraccount.menuandorder.XPath"));
		return new MenuAndOrder();
	}
	
	/*
	public PFYourAccount enterEmailaddress(String data) {
		enterByName(prop.getProperty("YourAccount.Logout.link"), data);
		return this;
	}

Reservation.date.name=reservationDate
Reservation.time.name=reservationTime
Reservation.size.name=partySize

	public PFYourAccount enterPassword(String data) {
		enterByName(prop.getProperty("Register.Password.name"), data);
		return this;
	}
	
	public PFYourAccount enterFirstname(String data) {
		enterByName(prop.getProperty("Register.Firstname.name"), data);
		return this;
	}
	public PFYourAccount enterLastname(String data) {
		enterByName(prop.getProperty("Register.Lastname.name"), data);
		return this;
	}
	
	public PFYourAccount enterPhone(String data) {
		enterByName(prop.getProperty("Register.Phone.name"), data);
		return this;
	}
	
	public PFYourAccount enterZip(String data) {
		enterByName(prop.getProperty("Register.Zip.name"), data);
		return this;
	}
*/	
	public PFYourAccount clickLogout() throws InterruptedException {
		clickByXpath(prop.getProperty("Youraccount.logout.XPath"));
		//Thread.sleep(3000);
		return this;
			
	}
	public PFHomePage clickNotuser() throws InterruptedException {
		clickByXpath(prop.getProperty("Youraccount.notuser.XPath"));
		//Thread.sleep(3000);
		return new PFHomePage();
	}

	

	/*public PFCreateAccount verifyLoginmessage(String data) {
		verifyTextByXpath(prop.getProperty("Login.message.XPath"), data);
		return new PFCreateAccount();
	}*/

	
	
}
