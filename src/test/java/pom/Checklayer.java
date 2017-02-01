package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checklayer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.pfchangs.com");
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@test-id='security-header-login2-link']")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@test-id='security-header-login2-link']")));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		System.out.println(links.size());
 
		for (int i = 1; i<links.size(); i++)
 
		{
 
			System.out.println(links.get(i).getText());
 
		}
 		//driver.findElement(By.className("login")).click();
		//driver.findElement(By.xpath("//a[@test-id='security-header-login2-link']")).click();
		//wait.until(ExpectedConditions.VisibilityofElementLocated(By.xpath(""//button[@value='Save Changes']"")));
		//driver.findElement(By.linkText("Menu & Order"));
		
		driver.findElement(By.xpath("//a[@test-id='main-navigation-Menu & Order']/span")).click();

	}

}
