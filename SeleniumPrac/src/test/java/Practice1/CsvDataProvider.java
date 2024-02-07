package Practice1;

import org.testng.annotations.DataProvider;

public class CsvDataProvider {

	@DataProvider(name="csvData")
	public Object[][] provideData(){
		ReadExcelExample read = new ReadExcelExample();
		
	}
}
