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

public class Task5 extends BaseClass{
@Test

public void test() throws IOException
{
	Task5 ob=new Task5();
    WebDriver driver=ob.driver();
	driver.get("https://demoqa.com/selectmenu/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    WebElement speed=driver.findElement(By.xpath("//*[@aria-owns='speed-menu']"));
    speed.click();
    List<WebElement> l=driver.findElements(By.xpath("//*[contains(@id,'ui-id')]"));
    for(WebElement element:l)
    {
        if(element.getText().equalsIgnoreCase("Faster"))
            element.click();
    }
    System.out.println(speed.getText());
    Assert.assertTrue(speed.getText().equalsIgnoreCase("Faster"));
    
    WebElement file=driver.findElement(By.xpath("//*[@aria-owns='files-menu']"));
    file.click();
    List<WebElement> fl=driver.findElements(By.xpath("//*[contains(@id,'ui-id')]"));
    for(WebElement e:fl)
    {
        if(e.getText().equalsIgnoreCase("ui.jQuery.js"))
            e.click();
    }
    System.out.println(file.getText());
    Assert.assertTrue(file.getText().equalsIgnoreCase("ui.jQuery.js"));
    
    WebElement num=driver.findElement(By.xpath("//*[@aria-owns='number-menu']"));
    num.click();
    List<WebElement> li=driver.findElements(By.xpath("//*[contains(@id,'ui-id')]"));
    for(WebElement number:li)
    {
        if(number.getText().equalsIgnoreCase("5"))
            number.click();
    }
    System.out.println(num.getText());
    Assert.assertTrue(num.getText().equalsIgnoreCase("5"));
    WebElement title=driver.findElement(By.xpath("//*[@aria-owns='salutation-menu']"));
    title.click();
    List<WebElement> tl=driver.findElements(By.xpath("//*[contains(@id,'ui-id')]"));
    for(WebElement e:tl)
    {
        if(e.getText().equalsIgnoreCase("Mrs."))
            e.click();
    }
    System.out.println(title.getText());
    Assert.assertTrue(title.getText().equalsIgnoreCase("Mrs."));
    System.out.println("Passed");
    driver.close();
}

}

