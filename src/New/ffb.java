package New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ffb {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement listBox=driver.findElement(By.id("month"));
		Select select = new Select(listBox);
		List<WebElement> list = select.getOptions();
		int count = list.size();
		System.out.println(count);
		
	
	}
}
