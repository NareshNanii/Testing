package New;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class Hover {
	
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception{
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/");
WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
Actions actions = new Actions(driver);
actions.contextClick(link).perform();
Robot r = new Robot();
r.keyPress(KeyEvent.VK_T);


//actions.sendKeys(Keys.CONTROL).click(link).perform();
//Thread.sleep(2000);
//Set<String> allwhs = driver.getWindowHandles();
//System.out.println(allwhs.size());
//
//for(String wh:allwhs){
//	driver.switchTo().window(wh);
//	System.out.println(driver.getTitle());
//	}
//driver.close();


//driver.get("https://www.istqb.org/");
//WebElement menu = driver.findElement(By.linkText("Certification"));
//Actions actions = new Actions(driver);
//actions.moveToElement(menu).perform();
//driver.findElement(By.linkText("Why ISTQB® Certification?")).click();



//driver.get("http://www.actitime.com");
//WebElement menu = driver.findElement(By.linkText("Features"));
////Mouse mover on the menu
//Actions actions = new Actions(driver);
//actions.moveToElement(menu).perform();
//driver.findElement(By.linkText("Simple Time Tracking")).click();


}

}
