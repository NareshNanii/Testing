package New;

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


public class Flip {
	
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception{

ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.flipkart.com");
driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
driver.findElement(By.name("q")).sendKeys("iphone X");
driver.findElement(By.xpath("//span[text()='iphone x mobile']/..")).click();
//String xp = "//div[starts-with(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]";
//driver.findElement(By.xpath("//button[contains(@class,'vh79eN')]")).click();
List<WebElement> allPrices = driver.findElements(By.xpath("//div[contains(@class,'_1vC4OE _2rQ-NK')]"));
int count = allPrices.size();
System.out.println(count);
//for(WebElement price:allPrices){
	//String text = price.getText();
	//System.out.println("original :" + text);
	//String formatedtext = text.substring(1).replaceAll(",", "");
	//System.out.println("formated " + formatedtext);
	//int v = Integer.parseInt(formatedtext);
	//System.out.println("int :" + v);

TreeSet<Integer> t = new TreeSet<Integer>();

for (WebElement p:allPrices){
String strPrice = p.getText().substring(1).replaceAll(",", "");
System.out.println(strPrice);
int v = Integer.parseInt(strPrice);
t.add(v);
}
System.out.println("-----low & high price----");
System.out.println(t.first());
System.out.println(t.last());
}
}
