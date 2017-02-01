package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://wwwqa.pfchangs.com/register");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	String S = driver.findElement(By.xpath("//button[@type='submit']")).getText();
	System.out.println("The button carries the lable : " +S );


	
	
	/* driver.findElement(By.id("lst-ib")).sendKeys("Saggezza");
	 Thread.sleep(5000);//
	 driver.findElement(By.id("lst-ib")).clear();
	  driver.findElement(By.name("q")).sendKeys("Peiwei");*/
	
	
	
	//driver.findElement(By.linkText("Images")).click();
	/*Thread.sleep(5000);
	 * 
	 * 
	//driver.findElement(By.xpath("//input[@name='accountEmail']")).
	driver.findElement(By.xpath("//input[@name='accountEmail']")).sendKeys("Muthuraman");
	String s = driver.findElement(By.xpath("//input[@name='accountEmail']")).getAttribute("value");
	System.out.println(s);
	
	
	//String pgs = driver.getPageSource();
	//System.out.println(pgs);
*/	
	
	
	}

}
