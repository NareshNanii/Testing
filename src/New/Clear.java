package New;
import java.util.List;
import java.util.Set;
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

import okio.Options;

public class Clear{
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		

ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");

WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.cleartrip.com");
driver.findElement(By.id("FromTag")).sendKeys("bang");
driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
driver.findElement(By.id("ToTag")).sendKeys("goa");
driver.findElement(By.xpath("//a[contains(text(),'Dabolim')]")).click();
driver.findElement(By.id("DepartDate")).click();
driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
driver.findElement(By.id("SearchBtn")).click();
List<WebElement> allPrice = driver.findElements(By.id("BaggageBundlingTemplate"));
int count = allPrice.size();
System.out.println(count);
for(WebElement price :allPrice){
String text = price.getText();
System.out.println("original" + text);
String formatedText=text.substring(1).replaceAll(",", "");
System.out.println("formated" + formatedText);
int v = Integer.parseInt(formatedText);
System.out.println("Int" + v);
}


for(int i=1;i<allPrice.size();i++){
	String p1=allPrice.get(i-1).getText().substring(1).replaceAll(",", "");
	String p2=allPrice.get(i).getText().substring(1).replaceAll(",", "");
	int v1= Integer.parseInt(p1);
	int v2= Integer.parseInt(p2);
	System.out.println("comparing" + v1 + "with" + v2);
	if(v1<=v2){
		System.out.println("pass...");
	}
	else{
		System.out.println("fail..");
	}
}
	
	}
}
