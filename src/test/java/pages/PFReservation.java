package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class PFReservation extends PFChangWrappers{

	public PFReservation() {
		if(!verifyTitle("Online Restaurant Reservations | Book a Table Online | P.F. Chang's"));
			//Reporter.reportStep("This is not Your Reservation Page", "FAIL");
	}

	public PFReservation enterLookupEmail(String data) {
		enterByName(prop.getProperty("Reservation.LookupEmail.name"), data);
		return this;
	}
	
	public PFReservation clickLookup() {
		clickByXpath(prop.getProperty("Reservation.Lookup.Xpath"));
		return this;
	}
	
	public PFReservation cancelReservation() {
		clickByXpath(prop.getProperty("Reservation.cancelReservation.XPath"));
		return this;
	}
	
	public PFReservation selectReservationdate(String data) {
		enterByName(prop.getProperty("Reservation.date.name"), data);
		return this;
	}

	  public PFReservation clickLocation() {
			clickByXpath(prop.getProperty("Reservation.Location.XPath"));
			return this;
		}
	
	public PFReservation selectReservationtime(String value) {
		selectByName (prop.getProperty("Reservation.time.name"), value);
		return this;
	}

	public PFReservation selectSize(String value) {
		selectByName (prop.getProperty("Reservation.size.name"), value);
		return this;
	}

	public PFReservation enterFirstname(String data) {
		enterByName(prop.getProperty("Reservation.Firstname.name"), data);
		return this;
	}
	public PFReservation enterLastname(String data) {
		enterByName(prop.getProperty("Reservation.Lastname.name"), data);
		return this;
	}
	public PFReservation enterEmailaddress(String data) {
		enterByName(prop.getProperty("Reservation.Emailaddress.name"), data);
		return this;
	}

	public PFReservation enterPhone(String data) {
		enterByName(prop.getProperty("Reservation.Phone.name"), data);
		return this;
	}
	
	public PFReservation verifyMessage(String data) {
		verifyTextByXpath(prop.getProperty("Reservation.message.XPath"), data);
		return this;
	}
	
	public PFReservation verifyfailureMessage(String data) {
		verifyTextByXpath(prop.getProperty("Reservation.failuremessage.Xpath"), data);
		return this;
	}
	
	public PFReservation verifyAlertMessage(String data) {
		verifyTextByXpath(prop.getProperty("Reservation.Alertmessage.Xpath"), data);
		return this;
	}
     public PFReservation MakeReservation() {
		clickByXpath(prop.getProperty("Reservation.make.XPath"));
		return this;
	}

	public PFCreateAccount clickLogout() {
		clickByXpath(prop.getProperty("Youraccount.logout.XPath"));
		return new PFCreateAccount();
	}

	public PFReservation submitReservation() {
		clickByXpath(prop.getProperty("Reservation.submit.XPath"));
		return this;
	}
			
	
}
