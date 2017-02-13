package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PFHomePage;
import wrappers.PFChangWrappers;

public class PF0010_SuccessfulReservation extends PFChangWrappers {
	@Test(dataProvider="fetchData")
	public void login(String location, String date ,String time,String value, String fname,String lname,String mail,String phone) throws InterruptedException{
		
	 new PFHomePage()
	 .clickonreservationmenu()
	 .MakeReservation()
	 .clickonselectlocation()
	 .enterlocation(location)
	 .clickonsearchlocation()
	 .selectnearlocation()
	 .selectReservationdate(date)
	 .clickonReservationLocation()
	 .clickReservationtime(time)
	 .selectspecialrequest()
	 .clickonbirthday()
	 .clickonbooster()
	 .enterFirstname(fname)
	 .enterLastname(lname)
	 .enterEmailaddress(mail)
	 .enterPhone(phone)
	 .submitReservation()
	 
		
		;
		
	}
		
		
	
	
	
	@BeforeClass
	public void beforeClass(){
		dataSheetName="PF0010";
		browserName="chrome";
		testCaseName="PFChangsReservation";
		testDescription="make areservation as a guest user";
	}

		
		
	}


