package FB;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ex {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
driver.navigate().to("http://www.amazon.com");
WebElement all = driver.findElement(By.id("searchDropdownBox"));
Select sel = new Select(all);
List<WebElement> list = sel.getOptions();
int count = list.size();
ArrayList<String> arr = new ArrayList<String>();
for (int i=0; i<count;i++){
	WebElement m = list.get(i);
	arr.add(m.getText());
}

System.out.println(arr);
list.get(2).click();


//for (WebElement p:list){
//	arr.add(p.getText());
//	
//}

	

//WebElement ele = driver.findElement(By.xpath("//span[text()='Departments']"));
//Actions act = new Actions(driver);
//act.moveToElement(ele).perform();
//WebElement elem=driver.findElement(By.xpath("//span[text()='Baby']"));
//act.moveToElement(elem).click().perform();

}
}
