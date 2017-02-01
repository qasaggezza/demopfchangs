package pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeChrome {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElementByLinkText("Gmail").click();
		
			
	}

}
