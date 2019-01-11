package Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Generic.WebGeneric;

public class DashboardPage {
	
	private WebDriver driver;
	
@FindBy(id="welcome")
private WebElement welcome;

@FindBy(xpath="//a[contains(@id ,'menu__Performance')]/b")
private WebElement performance;

@FindBy(id="menu_performance_viewEmployeePerformanceTrackerList")
private WebElement Employee;

@FindBy(xpath="//a/b[contains(text(),'PIM')]")
private WebElement pim;

@FindBy(id="menu_pim_Configuration")
private WebElement conf;

@FindBy(id="menu_pim_configurePim")
private WebElement option;

@FindBy(xpath="//a[contains(@id,'menu_leave_viewLeaveModule')]/b")
private WebElement leave;

@FindBy(id="leaveperiod_cmbStartMonth")
private WebElement month;

@FindBy(id = "leaveperiod_cmbStartDate")
private WebElement date;

@FindBy (xpath="//li/a[.='Logout']")
private WebElement logout;


public DashboardPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void mousehover(){
	Actions act = new Actions(driver);
	act.moveToElement(performance).click(Employee).perform();
}
public void mouse(){
	Actions act = new Actions(driver);
	act.moveToElement(pim).perform();
	act.moveToElement(conf).click(option).perform();
	
}
public void Leave(){
	Actions act = new Actions(driver);
	act.moveToElement(leave).click().perform();
}
public void Month(){
	Select sel = new Select(month);
	List<WebElement> s = sel.getOptions();
	ArrayList<String> list = new ArrayList<String>();
	for(WebElement name:s){
	 list.add(name.getText());
	}
	Collections.sort(list);
	for(String t:list)
		Reporter.log(t,true);
		sel.selectByIndex(5);
	
}

public void Date(){
	Select sel = new Select(date);
	sel.selectByIndex(5);
}

public void clickwelcome(){
	welcome.click();
}
public void clicklogout(long time){
	WebGeneric.waitForVisibilityAndClick(driver, time, logout);
}

}