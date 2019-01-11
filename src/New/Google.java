package New;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Google {
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nares/Desktop/Google.html");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("n1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.linkText("Google"));
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Goo")).click();

		
	}
}
