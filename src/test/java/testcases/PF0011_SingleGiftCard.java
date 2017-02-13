package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.PFHomePage;
import wrappers.PFChangWrappers;

public class PF0011_SingleGiftCard  extends PFChangWrappers{
	@Test(dataProvider="fetchData")
	public void login(String value, String quantity ,String addr1,String addr2 ,String msg,String fname,String lname,String phone,String address1,String address2,String city,String state,String zipcode,String method,String mail,String name,String number,String date,String gmail,String gpswd)throws  Exception{
		
		new PFHomePage()
		.clickonGiftCardsTab()
	    .clickonBuyAGiftCard()
		.enterCardvalue(value)
		.enterQuantity(quantity)
		.clickonnextgreetingcard()
		.selectgreetingcard()
		.clickonnextaddmsg()
		.enterToaddress(addr1)
		.enterFromaddress(addr2)
		.enteroptionalmessage(msg)
		.selectnextpreviewcard()
		.clickonAddToOrder()
		.clickonCheckOut()
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterPhone(phone)
		.enterAddress1(address1)
		.enterAddress2(address2)
		.enterCity(city)
		.enterState(state)
		.enterZipcode(zipcode)
		.enterShippingMethod(method)
		.enterEmail(mail)
		.clickonReviewOrder()
		.clickonPayNow()
		.enterCreditCardHolderName(name)
		.enterCreditCardNumber(number)
		.enterCreditCardExpiryDate(date)
		.clickonPaywithYourCCButton()
		.InvokeGmail()
		.enterEmail(gmail)
		.clickNextbutton()
		.enterPassword(gpswd)
		.clicksignIn()
		.clickUnreadMail1()
		
		
		
		
		;
		
		
		
	}
	@BeforeClass
	public void beforeClass(){
		dataSheetName="PF0011";
		browserName="chrome";
		testCaseName="SingleGiftCard";
		testDescription="dealing with giftcards as a guest user";
	}

}
