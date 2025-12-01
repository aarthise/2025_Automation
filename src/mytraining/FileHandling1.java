package mytraining;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling1 {

	public static void readtextdata()  {
		File f = new File("C://TestData\\data.txt");
		
		FileReader fr1=null;
		try
		{
			fr1 = new FileReader(f);
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			fr1.read();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
