package New;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Prop {
@Test
public static void testGrid() throws Exception{
	Properties p = new Properties();
	p.load(new FileInputStream("./Input/data.properties"));
	String v = p.getProperty("city");
	System.out.println(v);
}
}
