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

public class Demo1{
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/nares/Desktop/Demo.html");
// driver.findElement(By.linkText("Gmail")).click();
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
int count = allLinks.size();
for(int i=0; i<count; i++){
	WebElement link = allLinks.get(i);
	String text = link.getText();
	String url = link.getAttribute("href");
	
System.out.println(text+ " " + url);
}


	}

}
