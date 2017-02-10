package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Reporter;
import wrappers.PFChangWrappers;
/**
 * @author Muthuraman
 *
 */
public class Mail extends PFChangWrappers{

	public Mail() {
		if(!verifyTitle("Saggezza, Inc. Mail"));
		//Reporter.reportStep("This is not your mail page", "FAIL");
	}

	public Mail enterSearch(String data) throws InterruptedException {
		//enterByXpath(prop.getProperty("Mail.Searchtext.Xpath"), data);
		enterById(prop.getProperty("Mail.Searchtext.id"), data);
		Thread.sleep(2000);
		return this;
	}	

	public Mail clickSearchicon() {
		//clickByXpath(prop.getProperty("Mail.Searchicon.Xpath"));
		clickById(prop.getProperty("Mail.Searchicon.id"));
		return this;
	}

	public Mail clickSubject()  {
		//clickByXpath(prop.getProperty("Mail.Subject.Xpath"));
		clickById(prop.getProperty("Mail.Subject.id"));
		return this;
	}
	
	public Mail clickThread() {
		//clickByXpath(prop.getProperty("Mail.Subject.Xpath"));
		clickById(prop.getProperty("Mail.Thread.Xpath"));
		return this;
	}
	
	public Mail clickGoogleAccount() {
		clickByXpath(prop.getProperty("Mail.GoogleAccount.Xpath"));
		return this;
	}

	public GoogleAccounts clickSignOut() {
		clickById(prop.getProperty("Mail.SignOut.id"));
		return new GoogleAccounts();
	}

	public Mail verifycontent(String data) {
		verifyTextContainsByXpath(prop.getProperty("Mail.Content.Xpath"), data);
		return this;
	}
	public Mail clickUnreadMail1() throws InterruptedException 
	 {
	//System.out.println(driver.getTitle());
	java.util.List<WebElement> unreademail = driver.findElements(By.xpath("//span[@class='zF']"));
	//String MyMailer = "";

	for(int i=0;i<unreademail.size();i++)
	{
	   if(unreademail.get(i).isDisplayed()==true)
	   {
	   	unreademail.get(i).click();	 
	   	Reporter.reportStep("The Unread Mail is clicked.", "PASS");
	   	//Thread.sleep(5000);
	   }
	/*driver.findElement(By.xpath("//*[contains(@href,'https://wwwqa.peiwei.com/reset-password?email=')]")).click();
	System.out.println(driver.getTitle());
	clickByXpath(prop.getProperty("Gmail.Unread.Xpath"));*/

	}
	 return new Mail();
	  
	 }


}
