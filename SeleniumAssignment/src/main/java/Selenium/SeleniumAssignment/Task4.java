package Selenium.SeleniumAssignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task4 extends BaseClass{
@Test
public void test() throws IOException
{
	Task4 ob=new Task4();
    WebDriver driver=ob.driver();
	// Choose DOB
	String DOB = "04/04/1996";
    driver.get("https://demoqa.com/datepicker");
   WebElement date= driver.findElement(By.id("datepicker"));
   date.sendKeys(DOB);
   date.sendKeys(Keys.ENTER);
    System.out.println("passed");
    driver.quit();
    
}
}
