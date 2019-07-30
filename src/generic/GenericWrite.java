package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class GenericWrite 
{
	
public void  writeGeneric(WebElement ele,String s1,String s2,int k) throws IOException, EncryptedDocumentException, InvalidFormatException
{
	        
Select s= new Select(ele);
	
	   List<WebElement> w = s.getOptions();
	        int count = w.size();
	        System.out.println(count);
	        
	        
	        
FileInputStream fis= new FileInputStream(s1);
	
	Workbook wb = WorkbookFactory.create(fis);
	
	Sheet sh = wb.getSheet(s2);
	LinkedList<String> l2 = new LinkedList<String>();
     
	
	
	for(WebElement l1:w)
	{
		String text1 = l1.getText();
		l2.add(text1);
		Reporter.log(text1, true);
	}
	int count1 = l2.size();
	
	Row r = sh.createRow(k);
	
	for(int i=0;i<count1;i++)
	{
		Cell c = r.createCell(i);
		
		
		
		
		
			
		c.setCellValue(l2.get(i));
		FileOutputStream fos= new FileOutputStream(s1);
		wb.write(fos);
			
		
	}
}

public void writeGenericCol(WebElement ele, String s1,String s2,int k) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	Select s=new Select(ele);
	   List<WebElement> w = s.getOptions();
	        int count = w.size();
	        System.out.println(count);
	        
	        
	        
FileInputStream fis= new FileInputStream(s1);
	
	Workbook wb = WorkbookFactory.create(fis);
	
	Sheet sh = wb.getSheet(s2);
	
	LinkedList<String> l2 = new LinkedList<String>();
     
	
	
	for(WebElement l1:w)
	{
		String text1 = l1.getText();
		l2.add(text1);
		Reporter.log(text1, true);
	}
	int count1 = l2.size();
	Collections.sort(l2);
	
	
	
	for(int i=0;i<count1;i++)
	{
		Row r = sh.getRow(i);
		Row r1 = sh.createRow(i);
		Cell c = r1.createCell(k);
		c.setCellValue(l2.get(i));
		FileOutputStream fos= new FileOutputStream(s1);
		wb.write(fos);
			
		}
}
	
}
