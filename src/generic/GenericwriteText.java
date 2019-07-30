package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

public class GenericwriteText 
{
	public void write(List<WebElement> ele,String fi,String sh1,String fo,int k) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	
	FileInputStream fis= new FileInputStream(fi);
	
	Workbook wb = WorkbookFactory.create(fis);
	
	Sheet sh = wb.getSheet(sh1);
	LinkedList<String> l2 = new LinkedList<String>();
	for(WebElement l1:ele)
	{
		
		String text = l1.getText();
		System.out.println(text);
		l2.add(text);
		
	}
	int count1 = l2.size();
	
	
	
	for(int i=0;i<count1;i++)
	{
		Row r1 = sh.createRow(i);
		Cell c = r1.createCell(k);
		c.setCellValue(l2.get(i));
		FileOutputStream fos= new FileOutputStream(fo);
		wb.write(fos);
			
		
	}
}
}
