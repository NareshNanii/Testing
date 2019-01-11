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


public class HashMap {
	
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception{


LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
map.put("Name", "Naresh");
map.put("City", "Bnglr");
map.put("Eid", "A1");
map.put("Name", "Krishna");
System.out.println(map.get("Eid"));
//
System.out.println(map.get("City"));
//System.out.println(map.keySet());
//System.out.println(map.values());
//
System.out.println(map.containsKey("Name"));
//System.out.println(map.containsKey("Area"));

// NOTE: In HashMap values are stored under "Key" instead of index
// key is case sensitive and can't be duplicate 
// LinkedHaspMap will preserve insertion order 

//LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
//map.put("PC", 2);
//map.put("Projector", 2);
//map.put("Chair", 130);
//map.put("Marker", 4);
//
//
//if (map.containsKey("Projector")){
//	System.out.println("classroom has projector");
//	
//}




}

}
