package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;

public class GenericWrappers {

	protected static RemoteWebDriver driver;
	//protected  RemoteWebDriver driver;
	//public RemoteWebDriver driver;
	protected static Properties prop;
	public String sUrl,primaryWindowHandle,sHubUrl,sHubPort;
	public static String getTxt="";


	/*public String getText_From_Element(String xpathVal)
	{
		getTextFromElement = driver.findElement(By.xpath(xpathVal)).getText();
				return getTextFromElement; 
	}*/

	/*public void writeText_From_Element(String xpathVal)
	{
		driver.findElement(By.xpath(xpathVal)).clear();
		driver.findElement(By.xpath(xpathVal)).sendKeys(getTextFromElement);
	}*/

	public GenericWrappers() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./config.properties")));
			sHubUrl = prop.getProperty("HUB");
			sHubPort = prop.getProperty("PORT");
			sUrl = prop.getProperty("URL");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void invokeApp(String browser ) {
		invokeApp(browser,false);
	}
	/**
	 * This method will launch only firefox or chrome and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Muthu - Saggezza
	 * @param url - The url with http or https
	 * 
	 */
	//public boolean invokeApp(String browser ) {
		public void invokeApp(String browser,boolean bRemote ) {
		//boolean bReturn = false;
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName(browser);
			dc.setPlatform(Platform.WINDOWS);
						
			//this is for the grid
			if(bRemote)
			driver = new RemoteWebDriver(new URL("http://"+sHubUrl+":"+sHubPort+"/wd/hub"), dc);
			
			else{
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(sUrl);
						
			primaryWindowHandle = driver.getWindowHandle();		
			Reporter.reportStep("The browser:" + browser + " launched successfully", "PASS");
			//bReturn = true;

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The browser:" + browser + " could not be launched", "FAIL");
		}
		//return bReturn;
	}

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Muthu - Saggezza
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public boolean enterById(String idValue, String data) {
		boolean bReturn = false;
		try {
			//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(idValue)));
			driver.findElement(By.id(idValue)).clear();
			driver.findElement(By.id(idValue)).sendKeys(data);	
			Reporter.reportStep("The data: "+data+" entered successfully in field :"+idValue, "PASS");
			bReturn = true;

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The data: "+data+" could not be entered in the field :"+idValue, "FAIL");
		}
		return bReturn;
	}
	public boolean enterByName(String nameValue, String data) {
		boolean bReturn = false;
		String lbl="";
		try {
			driver.findElement(By.name(nameValue)).clear();
			driver.findElement(By.name(nameValue)).clear();
			driver.findElement(By.name(nameValue)).sendKeys(data);
		    lbl = driver.findElementByName(nameValue).getAttribute(nameValue);
			Reporter.reportStep("The data: "+data+" entered successfully in field :"+nameValue, "PASS");
			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The data: "+data+" could not be entered in the field :"+nameValue, "FAIL");
		}
		return bReturn;
	}
	public boolean enterByXpath(String nameVal, String data) {
		boolean bReturn = false;
		try {
			driver.findElement(By.xpath(nameVal)).clear();
			driver.findElement(By.xpath(nameVal)).clear();
			driver.findElement(By.xpath(nameVal)).sendKeys(data);	
			Reporter.reportStep("The data: "+data+" entered successfully in field :"+nameVal, "PASS");
			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The data: "+data+" could not be entered in the field :"+nameVal, "FAIL");
		}
		return bReturn;
	}
	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Muthu - Saggezza
	 * @throws InterruptedException 
	 */
	public boolean verifyTitle(String title) {
		boolean bReturn = false;
		try{
			if (driver.getTitle().equalsIgnoreCase(title)){
				Reporter.reportStep("The title of the page matches with the value :"+title, "PASS");
				bReturn = true;
			}else
				Reporter.reportStep("The title of the page:"+driver.getTitle()+" did not match with the value :"+title, "SUCCESS");

		}catch (Exception e) {
			Reporter.reportStep("The title did not match", "FAIL");
		}

		return bReturn;
	}

	/**
	 * This method will verify the given text using xpath
	 * @param xpath - The locator of the object in xpath
	 * @author Muthu - Saggezza
	 */
	public boolean verifyTextByXpath (String xpath, String text){
		boolean bReturn = false;
		try
		{
		String sText = driver.findElementByXPath(xpath).getText();
		if (driver.findElementByXPath(xpath).getText().trim().equalsIgnoreCase(text)){
			Reporter.reportStep("The text: "+sText+" matches with the value :"+text, "PASS");
			bReturn = true;
		}else{
			Reporter.reportStep("The text: "+sText+" did not match with the value :"+text, "FAIL");
		}

		} catch (NoSuchElementException e) {
		Reporter.reportStep("Unable to locate the message : " + text, "FAIL");
		} catch (WebDriverException e) {
			Reporter.reportStep("The Browser could not be found", "Fail");
		} 
		return bReturn;
	}

	/**
	 * This method will verify the given text is available using xpath
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Muthu - Saggezza
	 */
	public boolean verifyTextContainsByXpath(String xpath, String text){
		boolean bReturn = false;

		try
		{
			driver.findElementByXPath(xpath);
			String sText = driver.findElementByXPath(xpath).getText();
			System.out.println(sText);
			if (driver.findElementByXPath(xpath).getText().trim().contains(text)){
				Reporter.reportStep("The text: "+sText+" contains the value :"+text, "PASS");
			}else{
				Reporter.reportStep("The text: "+sText+" did not contain the value :"+text, "FAIL");
			}
			bReturn = true;
		} catch (NoSuchElementException e) {
			System.out.println("There is no Element by Xpath: " + xpath);
		} catch (WebDriverException e) {
			System.out.println("The Browser could not be found");
		} 
		return bReturn;
	}

	/**
	 * This method will close all the browsers
	 * @author Muthu - Saggezza
	 */
	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Reporter.reportStep("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.", "FAIL");
		}

	}

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Muthu - Saggezza
	 */
	public boolean clickById(String id) {
		boolean bReturn = false;
		try{
			driver.findElement(By.id(id)).click();
			Reporter.reportStep("The element with id: "+id+" is clicked.", "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The element with id: "+id+" could not be clicked.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Muthu - Saggezza
	 */
	public boolean clickByClassName(String classVal) {
		boolean bReturn = false;
		try{
			//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className(classVal)));
			new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
			driver.findElement(By.className(classVal)).click();
			Reporter.reportStep("The element with class Name: "+classVal+" is clicked.", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The element with class Name: "+classVal+" could not be clicked.", "FAIL");
		}
		return bReturn;
	}
	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Muthu - Saggezza
	 */
	public boolean clickByName(String name) {
		boolean bReturn = false;
		try{
			driver.findElement(By.name(name)).click();
			Reporter.reportStep("The element with name: "+name+" is clicked.", "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The element with name: "+name+" could not be clicked.", "FAIL");
		}
		return bReturn;
	}
	/**
	 * This method will click the element using link name as locator
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Muthu - Saggezza
	 */
	public boolean clickByLink(String name) {
		boolean bReturn = false;
		try{
			new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
			//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText(name)));
			driver.findElement(By.linkText(name)).click();
			Reporter.reportStep("The element with link name: "+name+" is clicked.", "PASS");
			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The element with link name: "+name+" could not be clicked.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Muthu - Saggezza
	 */
	public boolean clickByXpath(String xpathVal) {
		boolean bReturn = false;
		String txt = "";
		try{
			new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
			//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathVal)));
			txt = driver.findElement(By.xpath(xpathVal)).getText();
			driver.findElement(By.xpath(xpathVal)).click();
			//Reporter.reportStep("The element : "+xpathVal+" is clicked.", "PASS");
			Reporter.reportStep("The element : "+txt+" is clicked.", "PASS");
			bReturn = true;
		} catch (Exception e) {
			//Reporter.reportStep("The element with xpath: "+xpathVal+" could not be clicked.", "FAIL");
			Reporter.reportStep("The element : "+txt+" could not be clicked", "FAIL");		
		}
		
		return bReturn;
	}

	/**
	 * This method will mouse over on the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be moused over
	 * @author Muthu - Saggezza
	 */
	public boolean mouseOverByXpath(String xpathVal) {
		boolean bReturn = false;
		try{
			new Actions(driver).moveToElement(driver.findElement(By.xpath(xpathVal))).build().perform();
			Reporter.reportStep("The mouse over by xpath : "+xpathVal+" is performed.", "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The mouse over by xpath : "+xpathVal+" could not be performed.", "FAIL");
		}
		return bReturn;
	}

	/**
	 * This method will mouse over on the element using link name as locator
	 * @param xpathVal  The link name (locator) of the element to be moused over
	 * @author Muthu - Saggezza
	 */
	public boolean mouseOverByLinkText(String linkName) {
		boolean bReturn = false;
		try{
			new Actions(driver).moveToElement(driver.findElement(By.linkText(linkName))).build().perform();
			Reporter.reportStep("The mouse over by link : "+linkName+" is performed.", "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The mouse over by link : "+linkName+" could not be performed.", "FAIL");
		}
		return bReturn;
	}

	public String getTextByXpath(String xpathVal){
		String bReturn = "";
		try{
			getTxt =  driver.findElement(By.xpath(xpathVal)).getText();
		} catch (Exception e) {
			Reporter.reportStep("The element with xpath: "+xpathVal+" could not be found.", "FAIL");
		}
		return bReturn; 
	}

	/**
	 * This method will store the LeadID for the first record
	 * * @author Muthu - Saggezza
	 */
	public String GettextFirstRecord(String xpathVal){
		String ldId = driver.findElementByXPath(xpathVal).getText();
		return ldId;
	}
	/**
	 * This method will select the drop down value using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Muthu - Saggezza
	 */
	public boolean selectById(String id, String value) {
		boolean bReturn = false;
		try{
			new Select(driver.findElement(By.id(id))).selectByVisibleText(value);;
			Reporter.reportStep("The element with id: "+id+" is selected with value :"+value, "PASS");

			bReturn = true;
			

		} catch (Exception e) {
			Reporter.reportStep("The value: "+value+" could not be selected.", "FAIL");
		}
		return bReturn;
	}
	public boolean selectByName(String nameval, String value) {
		boolean bReturn = false;
		try{
			new Select(driver.findElement(By.name(nameval))).selectByVisibleText(value);;
			Reporter.reportStep("The element with name: "+nameval+" is selected with value :"+value, "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value: "+value+" could not be selected.", "FAIL");
		}
		return bReturn;
	}
	public boolean selectByXpath(String nameval, String value) {
		boolean bReturn = false;
		try{
			new Select(driver.findElement(By.xpath(nameval))).selectByVisibleText(value);;
			Reporter.reportStep("The element with xpath: "+nameval+" is selected with value :"+value, "PASS");
			bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("The value: "+value+" could not be selected.", "FAIL");
		}
		return bReturn;
	}
	public void loadObjects() throws FileNotFoundException, IOException{
		prop = new Properties();
		prop.load(new FileInputStream(new File("./object.properties")));

	}

	public boolean switchToParentWindow() {
		boolean bReturn = false;
		try{
		//driver.switchTo().window(primaryWindowHandle);
		// TODO Auto-generated method stub
		Set<String> allWin = driver.getWindowHandles();
		//System.out.println(allWin.size());
		for (String eachWin:allWin){
			driver.switchTo().window(eachWin);
					break;
		}
		bReturn = true;
		}catch (Exception e) {
			Reporter.reportStep("Unable to switch to parent window", "FAIL");
		} 
						return bReturn;
			}
	
	public boolean switchToLastWindow() {
		boolean bReturn = false;
		try{
		// TODO Auto-generated method stub
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin.size());
		for (String eachWin:allWin){
			driver.switchTo().window(eachWin);
		}
		bReturn = true;
		} catch (Exception e) {
			Reporter.reportStep("Unable to switch to child window", "FAIL");
		} 
						return bReturn;
	}

	public void acceptAlert() throws InterruptedException {
				driver.switchTo().alert().accept();
	}

	public boolean Rowcount(String xpathVal){
		boolean bReturn = false;
		try{
			List<WebElement> c = driver.findElementsByXPath(xpathVal);
			int count = c.size();

			if (count != 0) {
				Reporter.reportStep("There are "+count+ " records displayed for the search criteria", "Pass");
				bReturn = true;
			}
			else {
				Reporter.reportStep( count+ " records displayed for the search criteria", "Fail");
				bReturn = false;
			}
		} catch (Exception e) {
			Reporter.reportStep("Unable to proceed testing", "FAIL");
		}

		return bReturn;

	}

	public boolean invokeGmail(String browser) {
		boolean bReturn = false;
		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName(browser);
			dc.setPlatform(Platform.WINDOWS);
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://gmail.google.com");
			//primaryWindowHandle = driver.getWindowHandle();		
			Reporter.reportStep("The browser:" + browser + " launched successfully", "PASS");
			bReturn = true;

		} catch (Exception e) {
			e.printStackTrace();
			Reporter.reportStep("The browser:" + browser + " could not be launched", "FAIL");
		}
		return bReturn;
	}
}

