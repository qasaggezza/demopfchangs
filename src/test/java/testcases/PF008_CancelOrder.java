package testcases;
import org.testng.annotations.Test;
import pages.PFHomePage;
import pages.PFCreateAccount;
import wrappers.PFChangWrappers;

import org.testng.annotations.BeforeClass;

public class PF008_CancelOrder extends PFChangWrappers{
	@Test(dataProvider="fetchData")
	public void placeorder2(String emailaddress, String passWord, String mainQty, String Xtra1, String Xtra3, String Xtra6, String lunchQty, String plateQty, String glutenQty, String orddate, String ordtime  ) throws InterruptedException {
		
		new PFCreateAccount()
		.clicklogin()
		.enterEmailaddresslogin(emailaddress)
		.enterPasswordlogin(passWord)
		.clickloginSubmit()
		//.verifyEmailid(emailaddress)
		.ClickMenuandOrder()
		.clickMainMenu()
		.clickStreetfare5()
		.enterQuantity(mainQty)
		.clickAddtoOrder()
		.clickKeeplooking()
		.clickStreetfare1()
		.enterQuantity(Xtra1)
		.clickAddtoOrder()
		.clickKeeplooking()
		.clickStreetfare4()
		.enterQuantity(Xtra3)
		.clickAddtoOrder()
		.clickCheckout()
		/*.enterChopsticks(Xtra1)
		.clickAdd1()
		.enterPlasticware(Xtra3)
		.clickAdd3()
		.enterHotMustart(Xtra6)
		.clickAdd6()
*/		.clickAddmoreItems()
		.clickLunchMenu()
		.clickLunchPairings()
		.clickPairings4()
		.enterQuantity(lunchQty)
		.clickChoice1()
		.clickChoice4()
		.clickPairings1()
		.enterQuantity(Xtra6)
		.clickradio2()
		.clickChoice3()
		.clickChoice5()
		.clickAddtoOrder()
		.clickCheckout()
		/*.enterPlates(plateQty)
		.clickAdd2()
		.enterGlutenFreeSoySauce(glutenQty)
		.clickAdd5()*/
		.clickCheckout()
		.EnterOrderdate(orddate)
		.ClickLocation()
		.selectOrdertime(ordtime)
		.clickCancelOrder();
					}
	
@BeforeClass
	public void beforeClass() {
		dataSheetName="PF008";
		browserName="chrome";
		testCaseName="PF008 Cancel order ";
		testDescription="Placing order with valid data";
	}
		
}
