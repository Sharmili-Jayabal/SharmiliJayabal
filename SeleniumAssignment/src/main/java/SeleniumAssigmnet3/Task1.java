package SeleniumAssigmnet3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium.SeleniumAssignment.BaseClass;



public class Task1 extends BaseClass{
	@Test
    public void test1() throws IOException, InterruptedException {
    Task1 ob=new Task1();
    WebDriver driver=ob.driver();
    driver.get("https://www.makemytrip.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    //selecting trip round trip option
    driver.findElement(By.xpath("//li[contains(text(),'Round Trip')]")).click();
    driver.findElement(By.id("fromCity")).click();
    driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();
    driver.findElement(By.xpath("//span[contains(text(),'To')]")).click();
    driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']")).click();
    driver.findElement(By.xpath("//label[@for='departure']")).click();
    driver.findElement(By.xpath("(//*[@class='DayPicker-Caption'])[1]")).click();
    String DepartDate="5";
    String ReturnDate="10";
    String DepartMonth="June2020";
    while(true)
        {
        String month=driver.findElement(By.xpath("(//*[@class='DayPicker-Caption'])[1]"))
        		.getText();
        System.out.println(month);
        if(month.equalsIgnoreCase(DepartMonth)) 
        {
              break;
        }
        else
        {
        driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
        }
        }
         List<WebElement> date= driver.findElements(By.xpath("//*[@class='DayPicker-Day']"));
         //for selecting departure date
         for(WebElement e:date)
         {
             if(e.getText().contains(DepartDate)) {
                 e.click();
                 break;
             }
         }
         //for selecting return date.
         for(WebElement e:date)
         {
             if(e.getText().contains(ReturnDate)) {
                 e.click();
                 break;
             }
         }
         driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn')]")).click();
         String pricesort1= driver.findElement(By.xpath("//*[@id='sorter_btn_onward']")).getText();
	     String pricesort2= driver.findElement(By.xpath("//*[@id='sorter_btn_return']")).getText();
	     Assert.assertTrue(((pricesort1.contains("Price"))&&pricesort2.contains("Price")));
	     try
	     {
	     driver.findElement(By.xpath("//*[@id='ow-domrt-jrny']/div/div[1]")).click();
	     }
	     catch(ElementClickInterceptedException e)
	     {
	     driver.findElement(By.xpath("//*[@id='ow-domrt-jrny']/div/div[1]")).click();  
	     }
	     driver.findElement(By.xpath("//*[contains(@id,'bookbutton')]")).click();
	     driver.findElement(By.xpath("//*[@class='btn fli_primary_btn']")).click();
	     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	     System.out.println("No. of tabs: " + tabs.size());
	     if(tabs.size()>1)
	     System.out.println("review page is opened!");
	     else
	     System.out.println("review page is not opened!");
	     driver.quit();   
        
}
}