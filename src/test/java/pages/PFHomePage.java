package pages;

import utils.Reporter;
import wrappers.PFChangWrappers;
/**
 * @author Muthuraman
 *
 */
public class PFHomePage extends PFChangWrappers{

	public PFHomePage() {
		if(!verifyTitle("Asian Cuisine & Chinese Food Restaurant | P.F. Chang's"));
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	
	public PFCreateAccount clickRegister() {
		clickByLink(prop.getProperty("Home.Register.Linktext"));
		return new PFCreateAccount();

	}
	public PFCreateAccount clicklogin() {
		clickByClassName(prop.getProperty("Login.login.class"));
		return new PFCreateAccount();
	}
	
	/*public PFHomePage enterEmailaddresshome(String data) {
		enterById(prop.getProperty("Login.emailaddress.id"), data);
		return this;
	}

	public PFHomePage enterPasswordhome(String data) {
		enterById(prop.getProperty("Login.password.id"), data);
		return this;
	}


	public PFCreateAccount loginfailurehome() {
		clickByXpath(prop.getProperty("Login.submit.XPath"));
		return null;
	}	*/
}
