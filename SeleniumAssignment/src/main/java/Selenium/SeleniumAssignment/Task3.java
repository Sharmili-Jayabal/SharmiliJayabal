package Selenium.SeleniumAssignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task3 extends BaseClass{
@Test
public void test() throws IOException
{
	Task3 ob=new Task3();
    WebDriver driver=ob.driver();
	 driver.get("https://demoqa.com/droppable"); 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement From = driver.findElement(By.xpath("//*[@id='draggable']"));
	 WebElement To = driver.findElement(By.xpath("//*[@id='droppable']"));
	 
	  Actions act = new Actions(driver);
	  act.dragAndDrop(From,To).build().perform();
	 
	  String textTo = To.getText();
		if(textTo.equals("Dropped!")) {
		System.out.println("TEST PASS");
		}else {
		System.out.println("TEST FAIL");
		}
	 driver.quit();
}
}
