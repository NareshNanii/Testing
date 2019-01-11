package Test; 
import java.util.Set; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class Window 
{
	static{  
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		} 
	public static void main(String[] args) 
	{ 
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.naukri.com"); 
		Set<String> v = driver.getWindowHandles();   
		for(String h:v){   
			driver.switchTo().window(h);    
			System.out.println(driver.getTitle());    
			driver.close();   } 
		}
	} 
