package Practice1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ReadExcelExample;

public class CsvDataProvider {

	@DataProvider(name="csvData")
	public Object[][] provideData(){
		ReadExcelExample read = new ReadExcelExample();
		Object[][] data = read.ReadCsv();
		
		return data;
	}
	
	@Test (dataProvider="csvData")
	public void testcase1(String Name, String Age)
	{
		System.out.println("Name "+ Name);
		System.out.println("Age "+ Age);
	}
}
