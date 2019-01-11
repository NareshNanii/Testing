package New;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Upload{
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.seleniumhq.org/download");
//driver.findElement(By.tagName(a).click();
driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
Thread.sleep(1000);
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ESCAPE);

}
}
