package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wwwqa.pfchangs.com");
		String ttl = driver.getTitle();
		System.out.println(ttl);
		
		driver.findElement(By.linkText("Gmail")).click();
		String ttl1 = driver.getTitle();
		System.out.println(ttl1);
	}

}
