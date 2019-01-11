package New;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.SearchContext;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;

	public class c {
		static {
			String key = "webdriver.chrome.driver";
			String value = "./driver/chromedriver.exe";
		System.setProperty(key, value);
		}
		public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.naukri.com");
			String scr = driver.getPageSource();
			System.out.println(scr);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.quit();
		}

}
