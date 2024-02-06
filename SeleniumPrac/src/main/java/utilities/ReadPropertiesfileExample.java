package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesfileExample {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		
		File src = new File("./configuration.properties");
		
		FileInputStream fis = new FileInputStream(src);
		//System.out.println(fis);

		Properties obj = new Properties();
		
		obj.load(fis);
		
		System.out.println(obj.getProperty("age"));
		System.out.println(obj.getProperty("name"));
	}
	
	public String readpropertiesFile() throws IOException
	{
		File src = new File("./configuration.properties");
		
		FileInputStream fis = new FileInputStream(src);
		//System.out.println(fis);

		Properties obj = new Properties();
		
		obj.load(fis);
		
		return obj.getProperty("name");
		
	}

}
