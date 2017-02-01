package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Newtestcase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.peiwei.com");
		driver.findElement(By.id("searchLocation")).clear();
		driver.findElement(By.id("searchLocation")).sendKeys("Keystone, CO, United States");
		driver.findElement(By.className("search-submit")).click();
		
		
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		/*wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		driver.findElement(By.linkText("Register")).click();*/
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		driver.findElement(By.xpath("//a[@test-id='main-menu-order-link']")).click();
		//driver.close();
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@test-id='security-header-login2-link']")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@test-id='security-header-login2-link']")));
		//driver.findElement(By.className("login")).click();
		//driver.findElement(By.xpath("//a[@test-id='security-header-login2-link']")).click();
		
		
		//wait.until(ExpectedConditions.VisibilityofElementLocated(By.xpath(""//button[@value='Save Changes']"")));

		//wait.until(EspectedConditions.ElementTodisapear(webelement))
		

	}

}
