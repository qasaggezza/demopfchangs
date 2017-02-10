package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
public class PFReservation extends PFChangWrappers{

	public PFReservation() {
		if(!verifyTitle("Online Restaurant Reservations | Book a Table Online | P.F. Chang's"));
			//Reporter.reportStep("This is not Your Reservation Page", "FAIL");
	}
     

	public PFReservation selectReservationdate(String data) throws InterruptedException {
		enterByXpath(prop.getProperty("reservations.date.xpath"), data);
		Thread.sleep(2000);
		return this;
		
		
	}
	public PFReservation clickonReservationLocation() {
		clickByXpath(prop.getProperty("reservations.reservlocation.xpath"));
		return this;
	}
	
	
	 public PFReservation clickoncalendar() {
			clickByXpath(prop.getProperty("reservations.calendar.xpath"));
			return this;
		}
	
	 public PFReservation clickonLookup() throws InterruptedException {
			clickByXpath(prop.getProperty("reservations.lookup.xpath"));
			Thread.sleep(2000);
			return this;
		}
	

	public PFReservation clickReservationtime(String data) throws InterruptedException {
		clickByXpath(prop.getProperty("reservations.time.xpath"));
		//Thread.sleep(2000);
		return this;
	}

	public PFReservation selectSize(String value) {
		enterByXpath(prop.getProperty("reservations.partysize.xpath"), value);
		return this;
	}

	public PFReservation enterFirstname(String data) {
		enterByXpath(prop.getProperty("reservations.firstname.xpath"), data);
		return this;
	}
	public PFReservation enterLastname(String data) {
		enterByXpath(prop.getProperty("reservations.lastname.xpath"), data);
		return this;
	}
	public PFReservation enterEmailaddress(String data) {
		enterByXpath(prop.getProperty("reservations.emailaddress.xpath"), data);
		return this;
	}

	public PFReservation enterPhone(String data) {
		enterByXpath(prop.getProperty("reservations.phone.xpath"), data);
		return this;
	}



     public PFReservation MakeReservation() {
		clickByXpath(prop.getProperty("reservations.makeareservation.xpath"));
		return this;
	}


	public PFReservation clickLogout() {
		clickByXpath(prop.getProperty("Youraccount.logout.XPath"));
		return this;

	}
	public PFReservation submitReservation() {
		clickByXpath(prop.getProperty("reservations.submit.xpath"));
		return this;
	}
	public PFReservation clickonselectlocation() throws InterruptedException {
		clickByXpath(prop.getProperty("resevations.selectlocation.xpath"));
		//Thread.sleep(2000);
		return this;
		

	}


	public PFReservation enterlocation(String data) {
		enterByXpath(prop.getProperty("reservations.enterlocation.xpath"), data);
		return this;
	}
	public PFReservation clickonsearchlocation() throws InterruptedException {
		clickByXpath(prop.getProperty("reservations.searchlocation.xpath"));
		Thread.sleep(2000);
		return this;
	
	}
	public PFReservation selectnearlocation() {
		clickByXpath(prop.getProperty("reservations.selectnearestlocation.xpath"));
		return this;
		
	
	}
	public PFReservation selectspecialrequest() {
		clickByXpath(prop.getProperty("reservations.specialrequest.xpath"));
		return this;
	}
	public PFReservation clickonbirthday() {
		clickByXpath(prop.getProperty("reservations.birthday.xpath"));
		return this;
	}
	public PFReservation clickonbooster() {
		clickByXpath(prop.getProperty("reservations.booster.xpath"));
		return this;
	}
	
	
}
