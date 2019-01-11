package Script;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Utility;
import Generic.WebGeneric;
import Page.DashboardPage;
import Page.LoginPage;

public class DemoA extends BaseTest{

@Test
public void testA(){
	String un=Utility.getXLData(DATA_PATH, "Sheet1", 1, 0);
	String pw=Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);
	String homepageURL=Utility.getXLData(DATA_PATH, "Sheet1", 1, 2);
	String loginpageURL=Utility.getXLData(DATA_PATH, "Sheet1", 1, 3);
	
	//Enter valid user name and password and click login
	LoginPage l = new LoginPage(driver);
	l.setUserName(un);
	l.setPassword(pw);
	l.clickLogin();
	
	//Verify that dashboard page is displayed
	WebGeneric.VerifyURL(driver, lngETO, homepageURL);
}
//	@Test(groups={"dash"})
//	public void testB(){	
//	//click welcome and logout
//	DashboardPage d = new DashboardPage(driver);
//	d.mousehover();
//	d.mouse();
//	d.Leave();
//	d.Month();
//	d.Date();
////	d.clickwelcome();
////	d.clicklogout(lngETO);
//	
//	
//	//Verify that login page is displayed
//	//WebGeneric.VerifyURL(driver, lngETO, loginpageURL);
//	}


}
