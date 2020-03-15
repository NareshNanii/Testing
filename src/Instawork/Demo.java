package Instawork;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;




public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
//		For Firefox Driver
		
//		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
//To open in Chrome	
		WebDriver driver = new ChromeDriver();
// To open in Firefox		
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("instawork");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class, 'sbl1')]")).click();
		Thread.sleep(5000);
	
		
	List<WebElement> list = driver.findElements(By.tagName("cite"));

	
	for(WebElement e: list){
		System.out.println(e.getText());
	}
		
		WebElement w = list.get(0);
				
		String p = w.getText();
		
		boolean b = p.contentEquals("www.instawork.com");
		
		System.out.println(b);
		
		System.out.println(p);
		
	SoftAssert a = new SoftAssert();	
	a.assertEquals(p, "www.instawork.com");
	
driver.quit();
a.assertAll();
	
}
}

//To find result found in search page

//int page = 0;
//
//List<WebElement> list = driver.findElements(By.tagName("cite"));
//
//page++;
//
//for(int i=0;i<list.size();i++){
//	
//	String link = list.get(i).getText();
//	
//	if(link.contains("www.instawork.com")){
//			System.Out.println("Result found" + page);
//			break;
//}
//	else{
//		System.Out.println("Result Not found");
//	}



