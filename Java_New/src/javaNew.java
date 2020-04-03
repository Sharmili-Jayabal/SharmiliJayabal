
//comment the above line and uncomment below line to use Chrome
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class javaNew {
	public static void main(String[] j) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Click on each item and print their names
	   driver.get("https://demoqa.com/selectable");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//*[@id='selectable']/li[1]")).click();
       driver.findElement(By.xpath("//*[@id='selectable']/li[2]")).click();
       driver.findElement(By.xpath("//*[@id='selectable']/li[3]")).click();
       driver.findElement(By.xpath("//*[@id='selectable']/li[4]")).click();
       driver.findElement(By.xpath("//*[@id='selectable']/li[5]")).click();
       driver.findElement(By.xpath("//*[@id='selectable']/li[6]")).click();
       driver.findElement(By.xpath("//*[@id='selectable']/li[7]")).click();
      
       String item1 = driver.findElement(By.xpath("//*[@id='selectable']/li[1]")).getText();
        
       String item2 = driver.findElement(By.xpath("//*[@id='selectable']/li[2]")).getText();
       String item3 =  driver.findElement(By.xpath("//*[@id='selectable']/li[3]")).getText();
       String item4 =driver.findElement(By.xpath("//*[@id='selectable']/li[4]")).getText();
       String item5 = driver.findElement(By.xpath("//*[@id='selectable']/li[5]")).getText();
       String item6 = driver.findElement(By.xpath("//*[@id='selectable']/li[6]")).getText();
       String item7 = driver.findElement(By.xpath("//*[@id='selectable']/li[7]")).getText();
       
       System.out.println(item1 +" "+item2 +" "+ item3 +" "+ item4 +" "+ item5 +" "+ item6 +" "+ item7);
      
      //Fill the contact form an submit
       driver.get("https://demoqa.com/html-contact-form");
       Thread.sleep(10000);
       
       driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/input[1]")).sendKeys("web");
       Thread.sleep(10000);
       driver.findElement(By.id("lname")).sendKeys("Automation");
       Thread.sleep(10000);
       driver.findElement(By.name("country")).sendKeys("India");
       Thread.sleep(10000);
       driver.findElement(By.id("subject")).sendKeys("NA");
       Thread.sleep(10000);
       driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/input[4]")).click();
       Thread.sleep(10000);
       
      //Open link in new tabs
		driver.get("https://demoqa.com/html-contact-form");
       String SelectLinkNewTab= Keys.chord(Keys.CONTROL,Keys.RETURN);
       driver.findElement(By.linkText("Google Link")).sendKeys(SelectLinkNewTab);
       driver.findElement(By.linkText("Google Link is here")).sendKeys(SelectLinkNewTab);
       ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
       
       driver.switchTo().window(tabs.get(1));
       Thread.sleep(10000);
       driver.switchTo().window(tabs.get(0));
       Thread.sleep(10000);
       driver.switchTo().window(tabs.get(2));
       System.out.println("Passed");
       
		// Darg and drop
		 driver.get("https://demoqa.com/droppable"); Thread.sleep(10000);		 
		 WebElement From = driver.findElement(By.xpath("//*[@id='draggable']"));
		 WebElement To = driver.findElement(By.xpath("//*[@id='droppable']"));
		 
		  Actions act = new Actions(driver);
		  act.dragAndDrop(From,To).build().perform();
		  driver.findElement(By.xpath("//*[@id='droppable']/p"));
		 
       // Choose DOB
       driver.get("https://demoqa.com/datepicker");
       Thread.sleep(10000);
       driver.findElement(By.id("datepicker")).click();
       Thread.sleep(10000);
       driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();
       Thread.sleep(10000);
       System.out.println("passed");
        //close Chrome
        driver.close();
	}


}
