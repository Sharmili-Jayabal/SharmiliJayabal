package Selenium.SeleniumAssignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumAssigmnet3.Task1;

public class Task2 extends BaseClass{
@Test
public void test() throws IOException
{
	Task2 ob=new Task2();
    WebDriver driver=ob.driver();
	 driver.get("https://demoqa.com/html-contact-form");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//input[@class='firstname']")).sendKeys("web");     
     driver.findElement(By.id("lname")).sendKeys("Automation");    
     driver.findElement(By.name("country")).sendKeys("India");   
     driver.findElement(By.id("subject")).sendKeys("NA");    
     //Open link in new tabs
		driver.get("https://demoqa.com/html-contact-form");
    String SelectLinkNewTab= Keys.chord(Keys.CONTROL,Keys.RETURN);
    driver.findElement(By.linkText("Google Link")).sendKeys(SelectLinkNewTab);
    driver.findElement(By.linkText("Google Link is here")).sendKeys(SelectLinkNewTab);
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    
    driver.switchTo().window(tabs.get(0));
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    System.out.println("Passed");
    driver.quit();
}
}
