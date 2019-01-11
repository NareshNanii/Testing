package New;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Login{
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
	System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		//1) open browser
WebDriver driver = new ChromeDriver();
//2) enter url
driver.get("https://demo.actitime.com");
String expectedTitle = "actiTIME - Login";
System.out.println("Expected:" +expectedTitle);
String actualTitle = driver.getTitle();
System.out.println("Actual:" +actualTitle);
if(actualTitle.equals(expectedTitle)){
	System.out.println("pass: Title is matching");
}
else{
	System.out.println("Fail: Title is not matching");
}

//3) display username
WebElement userName = driver.findElement(By.id("username"));
String expecteduserName = "Username";
System.out.println("expected:" +expecteduserName);
boolean actualuserName = userName.isDisplayed();
System.out.println("actual:" +actualuserName);
if(userName.isDisplayed()){
	System.out.println("Pass: Username displayed");
}
else{
	System.out.println("Fail: Username not displayed");
}
//4)display pwd
WebElement pwd = driver.findElement(By.name("pwd"));
if(pwd.isDisplayed()){
	System.out.println("pwd is displayed: Pass");
}
else{
	System.out.println("pwd is displayed: Fail");
}
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
//5) click login
driver.findElement(By.xpath("//div[text()='Login ']")).click();	
Thread.sleep(1000);
String eHPTitle = "actiTIME - Enter Time-Track";
System.out.println("eHPTitle:" +eHPTitle);
String aHPTitle = driver.getTitle();
System.out.println("aHPTitle :" +aHPTitle);
if(aHPTitle.equals(eHPTitle)){
	System.out.println("pass");
}
else{
	System.out.println("Fail");
}

		
	}
}
