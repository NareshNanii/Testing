package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseMethod{

	@Test
	public void testA(){
		Reporter.log("@Test-testA", true);
	}
}
