package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
static {
	String key;
	String value;
	key = "webdriver.chrome.driver";
	value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
		String t  = driver.getTitle();
		System.out.println(t);
		String scr = driver.getCurrentUrl();
		System.out.println(scr);
		driver.navigate().to("http://www.naukri.com");
		java.util.Set<String> sc = driver.getWindowHandles();
		System.out.println(sc);
		System.out.println(sc.size());
}
}
