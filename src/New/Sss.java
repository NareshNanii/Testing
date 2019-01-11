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


public class Sss {
	
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception{
	WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/nares/Desktop/nthng.html");
//driver.findElement(By.id("t1")).sendKeys("abc");
String code = "document.getElementById('t1').value='abc'";
JavascriptExecutor j = (JavascriptExecutor)driver;
j.executeScript(code);

}
}
