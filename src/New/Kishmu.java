package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kishmu {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.redbus.com");
driver.findElement(By.xpath("//div[contains(@class, 'close')]")).click();

		
		
		
		
		
		
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	driver.get("http://www.gmail.com");
//	driver.findElement(By.id("identifierId")).sendKeys("nareshkrishnamoorthy7@gmail.com");
//	driver.findElement(By.xpath("//span[contains(@class,'RveJvd snByac')]")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//input[contains(@class,'whsOnd zHQkBf')]")).sendKeys("Nareshnanii");
//	driver.findElement(By.xpath("//span[contains(@class, 'RveJvd snByac')]")).click();
//		
	
	
	
	}
	
	
}
