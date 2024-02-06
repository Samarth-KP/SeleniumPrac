package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCsvExample {

	public static void main(String[] args) throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./ReadCsv.csv"));
		
		List <String[]> li = reader.readAll();
		
		System.out.println(li.size());
		
		Iterator<String[]> i1 = li.iterator(); 
		
		System.out.println(i1);
		
		//Iterate all values
		while(i1.hasNext()) {
			
			String[] str=i1.next();
			
			System.out.println("Values are");
			for(int i=0;i<str.length;i++)
			{
				System.out.println(" "+str[i]);
				
			}
			System.out.println("  ");
		}

	}

}
