package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.actitime.com/");
	LoginPage1 login = new LoginPage1(driver);
	login.setUsername("abc");
	login.setPassword("xyz");
	login.clickLogin();
	driver.navigate().refresh();
	login.setUsername("admin");
	login.setPassword("manager");
	login.clickLogin();
}
}
