package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy(id="username")
private WebElement unTB;
	@FindBy(name="pwd")
private WebElement pwTB;
	@FindBy(xpath="//div[text()= 'Login ']")
private WebElement loginBTN;

public LoginPage1(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void setUsername(String un){
	unTB.sendKeys(un);
}
public void setPassword(String pw){
	pwTB.sendKeys(pw);
}
public void clickLogin(){
	loginBTN.click();
}
}
