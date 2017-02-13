package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PFHomePage;
import pages.PFCreateAccount;
import wrappers.PFChangWrappers;

public class PF001_VerifyAlertMessage_FailureRegistration extends PFChangWrappers{
	
	@Test(dataProvider="fetchData", groups ="smoke")
	public void registerf(String emailaddress, String passWord,String fname, String lname,String phone,String zipcode,String message) throws Exception {
		new PFHomePage()
		.clickRegister()
		.enterEmailaddress(emailaddress)
		.enterPassword(passWord)
		.enterFirstname(fname)
		.enterLastname(lname)
		.enterPhone(phone)
		.enterZip(zipcode)
		.clickCreateMyAccount()
		.verifyAlertmessage(message);
				}
@BeforeClass
	public void beforeClass() {
		dataSheetName="PF001";
		browserName="chrome";
		testCaseName="PF001 Verify error message for Registration failure" ; 
		testDescription="Validate error messages";
	}
	
}
