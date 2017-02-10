package pages;

import wrappers.PFChangWrappers;

public class PFShipping extends PFChangWrappers {
	public PFShipping() {
		if(!verifyTitle("Check Out  | Gift Cards | P.F. Chang's"));
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	 public PFShipping enterFirstName(String data) {
			enterByXpath(prop.getProperty("GiftCards.Shippinginfofname.xpath"),data);
			return this;
		}
	 
	 public PFShipping enterLastName(String data) {
			enterByXpath(prop.getProperty("GiftCards.Shippinginfolname.xpath"),data);
			return this;
		}
	 public PFShipping enterPhone(String data) {
			enterByXpath(prop.getProperty("GiftCards.Shippinginfophone.xpath"),data);
			return this;
		}
	 public PFShipping enterAddress1(String data) {
			enterByXpath(prop.getProperty("GiftCards.Shippinginfoaddress1.xpath"),data);
			return this;
		}
	 public PFShipping enterAddress2(String data) {
			enterByXpath(prop.getProperty("GiftCards.Shippinginfoaddress2.xpath"),data);
			return this;
		}
	 public PFShipping enterCity(String data) {
			enterByXpath(prop.getProperty("GiftCards.Shippinginfocity.xpath"),data);
			return this;
		}
	 public PFShipping enterState(String data) {
			selectByXpath(prop.getProperty("GiftCards.Shippinginfostate.xpath"),data);
			return this;
		}
	 public PFShipping enterZipcode(String data) {
			enterByXpath(prop.getProperty("GiftCards.Shippinginfozipcode.xpath"),data);
			return this;
		}
	 public PFShipping enterShippingMethod(String data) {
			selectByXpath(prop.getProperty("GiftCards.Shippinginfomethod.xpath"),data);
			return this;
		}
	 public PFShipping enterEmail(String data) {
			enterByXpath(prop.getProperty("GiftCards.ShippingMail.xpath"),data);
			return this;
		}
	 public PFShipping clickonReviewOrder(){
		 clickByXpath(prop.getProperty("GiftCards.revieworder.xpath"));
		 return this;
	 }
	 public PFPaymentGateway clickonPayNow(){
		 clickByXpath(prop.getProperty("GiftCards.paynow.xpath"));
		 return new PFPaymentGateway() ;
	 }
}
