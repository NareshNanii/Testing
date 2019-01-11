package New;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class B {
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) {
	WebDriver d;
	SearchContext s;
	RemoteWebDriver r;
	JavascriptExecutor je;
	TakesScreenshot t;
	WebDriver wd;
	WebElement we;
	
	ChromeDriver driver = new ChromeDriver();
	
	}
}
