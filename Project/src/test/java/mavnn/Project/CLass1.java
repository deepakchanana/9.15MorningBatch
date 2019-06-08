package mavnn.Project;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CLass1 {
	
	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFRow row;
	private static FileInputStream fis;
	
	public static void loadFile() throws IOException
	{
		File file=new File("C:\\Users\\Dell\\Desktop\\New.xls");
		fis=new FileInputStream(file);
		workbook =new HSSFWorkbook(fis);
		sheet= workbook.getSheetAt(0);
		fis.close();	
	}
	
	public static Map<String, Map<String,ArrayList<String>>> getDataMap() throws IOException
	{
		if(sheet==null)
		{
			loadFile();
		}
		
		Map<String,Map<String,ArrayList<String>> >superMap=new HashMap<String,Map<String,ArrayList<String>> >();
		Map<String,ArrayList<String>> myMap=new HashMap<String,ArrayList<String>>();
		
		for(int i=1;i<sheet.getLastRowNum()+1;i++)
		{
			row=sheet.getRow(i);
		    String keyCell=row.getCell(0).getStringCellValue();
		    ArrayList<String> al = new ArrayList<String>();
		    for(int j=1;j<row.getLastCellNum();j++)
		    {
		    	 
		    	al.add(row.getCell(j).getStringCellValue());
		    	

		    		
		    	
		    }
			myMap.put(keyCell, al);
			al=null;
		    
		    
		    superMap.put("TestData", myMap);
		    
		   
		}
		
		return superMap;
	}
	//ArrayList<String>
	public static ArrayList<String> getKeyValue(String key) throws IOException
	{
		
		Map<String,ArrayList<String>> actualvalue=getDataMap().get("TestData");
		
		
		
		return actualvalue.get(key);
		  
		  
		   
		     
		//ArrayList<String> s=actualvalue.get(key);
		
		
		
		//System.out.println(s.size());

		
	}
	

	public static void main(String [] args)  throws IOException
	{
		System.out.println(getKeyValue("Username"));
		
		
	}

}