package testcases;
import org.testng.annotations.Test;
import pages.PFHomePage;
import pages.PFCreateAccount;
import wrappers.PFChangWrappers;

import org.testng.annotations.BeforeClass;

public class PF005_SuccessfulReservation extends PFChangWrappers{
	@Test(dataProvider="fetchData")
	public void reservation(String emailaddress, String passWord,String reservationDate, String reservationTime,String size, String message) throws InterruptedException {
		
		new PFHomePage()
		.clicklogin()
		.enterEmailaddresslogin(emailaddress)
		.enterPasswordlogin(passWord)
		.clickloginSubmit()
		.verifyEmailid(emailaddress)
		.MakeReservation()
		.selectReservationdate(reservationDate)
		.clickLocation()
		.selectReservationtime(reservationTime)
		.selectSize(size)
		.submitReservation()
		.verifyMessage(message)
		.clickLogout()
		.clickNotuser();
					}
	
@BeforeClass
	public void beforeClass() {
		dataSheetName="PF005";
		browserName="chrome";
		testCaseName="PF005 Make a Reservation with valid data";
		testDescription="Reservation with valid data";
	}

		
}
