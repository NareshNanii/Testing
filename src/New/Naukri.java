package New;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Naukri{
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		//1) open browser
WebDriver driver = new ChromeDriver();
//2) enter url
driver.get("https://www.naukri.com");
String parent = driver.getWindowHandle();
Set<String> v = driver.getWindowHandles();
System.out.println(v.size());
v.remove(parent);

for(String w:v){
	driver.switchTo().window(w);
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
}