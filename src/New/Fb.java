package New;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Fb {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	WebElement listBox = driver.findElement(By.id("month"));
	Select select = new Select(listBox);
	List<WebElement> list = select.getOptions();
	ArrayList<String> allText1 = new ArrayList<String>();
	
	for(WebElement option:list){
		allText1.add(option.getText());
	}
	
	List<String> allText2 = new ArrayList<String>(allText1);
	//allText2.add(allText1);
	Collections.sort(allText2);
	
	System.out.println(allText2);
	System.out.println(allText1);
	
	if(allText1.equals(allText2)){
		System.out.println("Listbox content is in sorted order");
	}
	else{
		System.out.println("Listbox content is NOT in sorted order");
	}
	
	
	
	
//	int count = list.size();
//	System.out.println("total no is :" +count);
	
		

	

	
//	for(int i = 0;i<list.size();i++){
//		String texts=allText.get(i);
//		System.out.println(texts);
//	}
//	
	
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement listBox = driver.findElement(By.id("month"));
//	Select select = new Select(listBox);
//	List<WebElement> allOptions = select.getOptions();
//	List<String> allText = new ArrayList<String>();
//	for(WebElement option:allOptions){
//		allText.add(option.getText());
//	
////	for(int i=0;i<allOptions.size();i++){
////		WebElement option = allOptions.get(i);
////		String text = option.getText();
////		System.out.println(text);
////		
//	}
//	Collections.sort(allText);
//	for( String text:allText){
//		System.out.println(text);
//	}
//}
//}
