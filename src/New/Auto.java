package New;
import java.util.List;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Auto{
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException{
		
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
driver.findElement(By.id("lst-ib")).sendKeys("java");

List<WebElement> all = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
int count = all.size();
System.out.println(count);

for(WebElement e: all){
	System.out.println(e.getText());
}
all.get(0).click();
	}
}
