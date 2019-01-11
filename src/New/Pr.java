package New;

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

	public class Pr {
		static {
			String key = "webdriver.chrome.driver";
			String value = "./driver/chromedriver.exe";
		System.setProperty(key, value);
		}
		public static void main(String[] args) {
			
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.flipkart.com");
			
		}
}
