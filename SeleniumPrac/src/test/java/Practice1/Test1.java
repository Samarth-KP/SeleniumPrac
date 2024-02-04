package Practice1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	@Test(priority=0)
	public void testcase1()
	{
		System.out.println("in the test case 1");
	}
	
	@Test
	public void Atestcase2()
	{
		System.out.println("in the test case 2");
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("in the test case 3");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("in before method");
	}
	
}