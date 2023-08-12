package checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExceutor 
{
	
	public static void main(String args[])
	{
		try
		{
			FileInputStream s=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\React App.pdf");
			System.out.println("File found");
		}
		catch(FileNotFoundException e)
		
		{
			
			System.out.println(e.getMessage());
		}
	}
}


