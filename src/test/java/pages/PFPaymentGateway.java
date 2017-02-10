package pages;

import wrappers.PFChangWrappers;

public class PFPaymentGateway extends PFChangWrappers {
	public PFPaymentGateway() {
		if(!verifyTitle("Payment Portal - Gift Cards: Payment"));
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	 public PFPaymentGateway enterCreditCardHolderName(String data) {
			enterById(prop.getProperty("Giftcards.cardholdername.id"),data);
			return this;
		}
	 public PFPaymentGateway enterCreditCardNumber(String data) {
			enterById(prop.getProperty("Giftcards.creditcardnumber.id"),data);
			return this;
		}
	 public PFPaymentGateway enterCreditCardExpiryDate(String data) {
			enterById(prop.getProperty("Giftcards.creditcardexpirydate.id"),data);
			return this;
		}
	 public PFPaymentGateway   clickonPaywithYourCCButton() {
			clickByXpath(prop.getProperty("Giftcards.paywithyourcreditcard.xpath"));
			return this;
		}
	 public Gmail InvokeGmail() throws InterruptedException {
			/*System.setProperty("webdriver.chrome.driver", "C:/Pfchangs/chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			driver.get("https://www.gmail.com");
			driver.manage().window().maximize();
			switchToLastWindow();*/
			driver.navigate().to("https://www.gmail.com");
			Thread.sleep(3000);
			return new Gmail();
			}
}
