package New;
import java.util.LinkedHashMap;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class Js {
	
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.actitime.com/license-agreement");
	String xp = "//h3[text() = '4. Fees']";
	WebElement e = driver.findElement(By.xpath(xp));
	
//	int x = e.getLocation().getX();
//	System.out.println(x);
//	
//	int y = e.getLocation().getY();
//	System.out.println(y);
//	
//	JavascriptExecutor j = (JavascriptExecutor)driver;
//	j.executeScript("window.scrollBy("+x+" ,"+y+")");
	
	
	
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
	for(int i=1; i<=10; i++){
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
	}
	for(int i=1; i<=10; i++){
		j.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
	}
	
	

//WebDriver driver = new ChromeDriver();
//driver.get("https://demo.actitime.com/");
//JavascriptExecutor j = (JavascriptExecutor)driver;
//String msg = "Happy festival";
//j.executeScript("alert('" + msg + "')");

}
}
