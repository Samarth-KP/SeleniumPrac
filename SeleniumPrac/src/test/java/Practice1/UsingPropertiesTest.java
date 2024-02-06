package Practice1;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.ReadPropertiesfileExample;

public class UsingPropertiesTest {

	@Test
	public void TestCase1() throws IOException {
		ReadPropertiesfileExample read = new ReadPropertiesfileExample();
		String firstName = read.readpropertiesFile();
		System.out.println("Name is :" +firstName);
	}
}
