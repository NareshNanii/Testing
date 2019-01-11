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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class Frame {
	
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception{
	WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/nares/Desktop/Page1.html");
//using index
driver.switchTo().frame(0);
driver.findElement(By.id("t2")).sendKeys("A");
driver.switchTo().parentFrame();
driver.findElement(By.id("t1")).sendKeys("B");

//using id
driver.switchTo().frame("f1");
driver.findElement(By.id("t2")).sendKeys("A");
driver.switchTo().defaultContent();
driver.findElement(By.id("t1")).sendKeys("B");

//using address
WebElement e = driver.findElement(By.tagName("iframe"));
driver.switchTo().frame(e);
driver.findElement(By.id("t2")).sendKeys("A");
driver.switchTo().parentFrame();
driver.findElement(By.id("t1")).sendKeys("B");

}
}
