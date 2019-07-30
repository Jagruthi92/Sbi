package generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectGeneric 
{
	
	  Select s;
	
	public  SelectGeneric(WebElement element)
	{
		s=new Select(element);
	}
	
	public  void selcetIndex(int i)
	 {
		
		 s.selectByIndex(i);
	 }
	 
	 public  void selectValue(String s1)
	 {
		 
		 s.selectByValue(s1);
	 }
	 
	 public  void selectText(String s1)
	 {
		 
		 s.selectByVisibleText(s1);
		 
	 }
	 
	 public  void Options()
	 {
		 
		 List<WebElement> we = s.getOptions();
		 int count = we.size();
		 for(WebElement l:we)
		 {
			 String text = l.getText();
			 System.out.println(text);
		 }
		 
		 
	 }
	 
	 public   void Multiple(WebElement ele)
	 {
		 
		 boolean m = s.isMultiple();
		 System.out.println(m);
		 
	 }
	 
	 public void deselect(WebElement ele)
	 {
		 
		 s.deselectAll();
	 }
	 
	 public void deselectIndex(WebElement ele,int i)
	 {
		 
		  s.deselectByIndex(i);
	 }
	 
	 public   void deselectValue(WebElement ele,String s1)
	 {
		 
		 s.deselectByValue(s1);
	 }
	 
	 public  void deselectText(WebElement ele,String s1)
	 {
		 
		 s.deselectByVisibleText(s1);
	 }
	 
	 public  void getselectOption(WebElement ele)
	 {
		 
		 List<WebElement> o = s.getAllSelectedOptions();
	 }
	 
	 public  void getFirstOption(WebElement ele)
	 {
		 
		  WebElement o = s.getFirstSelectedOption();
	 }
	 
}
