package New;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class Hotel {
	
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception{
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/nares/Desktop/MyHotel.html");
	WebElement listBox = driver.findElement(By.id("SLV"));
	Select select = new Select(listBox);
	List<WebElement> allOptions = select.getOptions();
	int count = allOptions.size();
	System.out.println(count);
	//LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
	
	for (WebElement option:allOptions){
		String key = option.getText();
		System.out.println(key);
//		if(map.containsKey(key)){
//			Integer value = map.get(key);
//			value++;
//			map.put(key, value);
		}
//		else{
//			map.put(key, 1)	;	}
//	}
//System.out.println(map);
	
	//Q6
//	String s = "Idly";
//	if(map.get(s)>1){
//		System.out.println(s+ "is duplicate");
//	}
//	else {
//		
//	}
	
	
		
//	select.selectByIndex(0);
//	select.selectByValue("v");
//	select.selectByVisibleText("Dosa");
//	
//	List<WebElement> a = select.getAllSelectedOptions();
//	System.out.println(a.size());
//	
//	List<WebElement> c = select.getOptions();
//	System.out.println(c.size());
//	
//	if(select.isMultiple()){
//		System.out.println("we can deselect....");
//		select.deselectByIndex(0);
//		select.deselectByValue("v");
//		select.deselectByVisibleText("Dosa");
//		select.deselectAll();
//	}
//	else{
//		System.out.println("we can not deselect on single select list box");
//	}
	
	
}
}
