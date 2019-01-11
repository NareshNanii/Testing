package New;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
public static void main(String[] args) {
	//String key = "webdriver.chrome.driver";
	//String value = "./driver/chromedriver.exe";
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.close();
}
}
