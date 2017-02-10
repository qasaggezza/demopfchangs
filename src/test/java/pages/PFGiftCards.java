package pages;

import wrappers.PFChangWrappers;

public class PFGiftCards extends PFChangWrappers {
	
	public PFGiftCards() {
		if(!verifyTitle("Online Restaurant Gift Cards | Restaurant eGift Cards | P.F. Chang's"));
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	 public PFGiftCards clickonBuyAGiftCard() throws InterruptedException {
			clickByXpath(prop.getProperty("GiftCards.BuyAGiftCard.xpath"));
			Thread.sleep(2000);
			return this;
		}
	 public PFGiftCards enterCardvalue(String data) {
			selectByXpath(prop.getProperty("GifCards.CardValue.xpath"),data);
			return this;
		}
	 public PFGiftCards enterQuantity(String data) {
			enterByXpath(prop.getProperty("GiftCards.Quantity.xpath"),data);
			return this;
		}
	 public PFGiftCards clickonnextgreetingcard() {
			clickByXpath(prop.getProperty("GiftCards.nextgreetingcard.xpath"));
			return this;
		}
	 public PFGiftCards selectgreetingcard() {
			clickByXpath(prop.getProperty("GiftCards.selectagreetingcard.xpath"));
			return this;
		}
	 public PFGiftCards clickonnextaddmsg() {
			clickByXpath(prop.getProperty("GiftCards.nextaddmessage.xpath"));
			return this;
		}
	 public PFGiftCards enterToaddress(String data) {
			enterByXpath(prop.getProperty("GiftCards.addoptionalmsgto.xpath"),data);
			return this;
		}
	 public PFGiftCards enterFromaddress(String data) {
			enterByXpath(prop.getProperty("GiftCards.addoptionalmsgfrom.xpath"),data);
			return this;
		}
	 public PFGiftCards enteroptionalmessage(String data) {
			enterByXpath(prop.getProperty("GiftCards.addoptionalmsg.xpath"),data);
			return this;
		}
	 public PFGiftCards selectnextpreviewcard() {
			clickByXpath(prop.getProperty("GiftCards.nextpreviewcard.xpath"));
			return this;
		}
	 public PFGiftCards clickonAddToOrder() {
			clickByXpath(prop.getProperty("GiftCards.AddtoOrder.xpath"));
			return this;
		}
	 public PFShipping clickonCheckOut() {
			clickByXpath(prop.getProperty("GiftCards.checkout.xpath"));
			return new PFShipping();
		}
	 
}
