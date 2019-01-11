package New;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Screenshot {
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) throws IOException {
		Date d = new Date();
		String v = d.toString();
		System.out.println(v);
		String v2 = v.replaceAll(":", "-");
		System.out.println(v2);
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./photo/"+v2+"png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
		//http://www.w3schools.com/html
	}

}
