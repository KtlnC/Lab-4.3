import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**Created by Kaitlyn Cao on 12/19/2017
 * Lab 4.2 CSV Utilities*/

public class CSVUtilities {
	
	ArrayList<String> CSVData;
	int numColumns;
	
	public CSVUtilities(File csv)
	{
		
		FileReader reader = null;
		BufferedReader filein = null;
		
		try
		{
		 reader = new FileReader(csv);
		 filein = new BufferedReader(reader);
		 
		 String line = filein.readLine();
		 while(line != null)
		 {
			 
			 String[] cases = line.split(",");
			 
			 CSVData.add(line);
		 
			 line = filein.readLine();
		 }
		
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("ERROR: File not found!");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	

/**
 * 1/8/18
 * Add a writeCSV(File file) method
 * */	
/*	
   //Return an ArrayList with the headers for each column
	public List<String> getColumnHeaders()
	{
		return CSVData;
	}
	
	//Return an ArrayList with the data for a column specified
	public List<String> getDataString(String column)
	{
		
		return CSVData;
		
	}
	
	//Return an ArrayList with the data converted to Integer
	public List<Integer> getDataInt(List column)
	{
		return null;
		
	}
	
	//Return an ArrayList with the data converted to Double
	public List<Double> getDataDouble(double column)
	{
		return null;
	}
*/
}
