package generic;

import java.io.FileInputStream;






import java.util.Collections;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Generic_read_MultipleData implements Auto_const
{
	
	public void readMultipleData(String s2) 
	{
		try
		{
		FileInputStream fis= new FileInputStream(EXCEL_PATH);
		
		Workbook wb = WorkbookFactory.create(fis);
		            Sheet sh = wb.getSheet(s2);
		            int row = sh.getLastRowNum();
		            System.out.println(row);
		            for(int i=0;i<=row;i++)
		            {
		            Row r = sh.getRow(i);	
		           short cell = r.getLastCellNum();
		           
		           for(int j=0;j<cell;j++)
		            {
		                   Cell c = r.getCell(j);
		                   try{
		                     String v = c.toString();
		          Reporter.log(v, true);
		           
		                   }
		                   catch(Exception e)
		                   {
		                	   
		                   }
		            
		            }
		           System.out.println();
		            
		            }
		}
		catch(Exception e)
		{
		Reporter.log("data is encrpted", true);
		}
}	
	
	public void readSort(String s2) 
	{
		try
		
		{
		FileInputStream fis= new FileInputStream(EXCEL_PATH);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet(s2);
		
		int row = sh.getLastRowNum();
		LinkedList<String>  l= new LinkedList<String>();
		for(int i=0;i<=row;i++)
		{
			Row r= sh.getRow(i);
			short cell = r.getLastCellNum();
			
			for(int j=0;j<cell; j++)
			{
				Cell c = r.getCell(j);
				String v= c.toString();
				
				Reporter.log(v, true);
				l.add(v);
							}
			System.out.println();
		}
		Collections.sort(l);
		
		
		for(String l1:l)
		{
			Reporter.log(l1, true);
		}
		
		Collections.sort(l,Collections.reverseOrder());
		
		for(String l2:l)
		{
			Reporter.log(l2, true);
		}
		
		
		}
		catch(Exception e)
		{
			Reporter.log("data encrypted", true);
		}
	}
	
	

}
