package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Generic_read_single_data implements Auto_const

{
	public static String getCellValue(String sheet,int row,int cell)
	
	{
		String value=" ";
		try{
        FileInputStream fis= new FileInputStream(EXCEL_PATH);
        
        Workbook wb = WorkbookFactory.create(fis);
        
		Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		
		value=c.toString();
			
		}
		catch(Exception e)
		{
			Reporter.log("path is invalid", true);
		}
		
		return value;
		
	}
	

}
