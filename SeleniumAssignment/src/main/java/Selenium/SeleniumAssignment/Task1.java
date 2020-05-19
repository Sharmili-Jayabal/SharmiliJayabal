package Selenium.SeleniumAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Task1 extends BaseClass{
	@Test
	public void test1()
	{
		
		WebDriver driver = null;
		//Click on each item and print their names
	   driver.get("https://demoqa.com/selectable");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      
	   List<WebElement> li = new ArrayList<WebElement>();
       li=driver.findElements(By.xpath("//*[@class='ui-widget-content ui-selectee']"));
       for(WebElement a:li)
       {
    	   String name = a.getText();
    	   
    	   System.out.println(name);
       }
       driver.close();
	}
	}
