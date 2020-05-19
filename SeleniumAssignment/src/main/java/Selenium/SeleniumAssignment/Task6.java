package Selenium.SeleniumAssignment;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task6 extends BaseClass{

	@Test
	public void test() throws IOException
	{
		Task6 ob=new Task6();
	    WebDriver driver=ob.driver();
		driver.get("https://demoqa.com/controlgroup/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //horizontal rental car
	    WebElement ct=driver.findElement(By.id("car-type-button"));
	    ct.click();
	    List<WebElement> l=driver.findElements(By.xpath("//*[contains(@id,'ui-id')]"));
	    for(WebElement e:l)
	    {
	        if(e.getText().equalsIgnoreCase("SUV"))
	            e.click();
	    }
	    Assert.assertTrue(ct.getText().equalsIgnoreCase("SUV"), "SUV is not selected");	   
	    
	    WebElement standard=driver.findElement(By.xpath("(//*[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank'])[1]"));
	    if(!(standard.isSelected()))
	        standard.click();
	    
	    //checking the insurance checkbox
	    WebElement insurance=driver.findElement(By.xpath("(//*[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank'])[3]"));
	    if(!(insurance.isSelected()))
	        insurance.click();
	    
	    driver.findElement(By.id("horizontal-spinner")).sendKeys("2");
	    driver.findElement(By.xpath("//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']")).click();
	    
	    //vertical rental car
	    WebElement ct2=driver.findElement(By.id("ui-id-8-button"));
	    ct2.click();
	    List<WebElement> l2=driver.findElements(By.xpath("//*[contains(@id,'ui-id')]"));
	    for(WebElement element:l2)
	    {
	        if(element.getText().equalsIgnoreCase("Luxury"))
	            element.click();
	    }
	        
		Assert.assertTrue(ct2.getText().equalsIgnoreCase("Luxury"), "Luxury is not selected");
	    
	    WebElement automatic=driver.findElement(By.xpath("(//*[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank'])[4]"));
	    if(!(automatic.isSelected()))
	        automatic.click();
	    
	    //checking the insurance checkbox
	    WebElement insurance1=driver.findElement(By.xpath("(//*[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank'])[5]"));
	    if(!(insurance1.isSelected()))
	        insurance1.click();
	    
	    driver.findElement(By.id("vertical-spinner")).sendKeys("4");
	    driver.findElement(By.xpath("//button[@id='book']")).click();
	    
	    driver.close();
	    }


	}

