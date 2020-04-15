import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	   driver.get("https://www.olay.co.uk/en-gb");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("(//*[@class='event_profile_register'])[1]")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("test@auto.com");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys("Test@123");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys("Test@123");
       
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']/option[2]")).click();
       
       driver.findElement(By.xpath("(//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]'])[1]")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']/option[5]")).click();
       
       driver.findElement(By.xpath("//*[@id='onetrust-reject-all-handler']")).click();

       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']/option[4]")).click();
       
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_submit']")).click();
       
       
       //Spain
       driver.get("https://www.olay.es/es-es");
       Thread.sleep(2000);
       
      driver.findElement(By.xpath("//*[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']/div/a[2]")).click();

       Random randomGenerator = new Random();
       int randomInt = randomGenerator.nextInt(1000);
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id='BrandComWebsite']/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_imgfemale']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[firstname]']")).sendKeys("Web");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[lastname]']")).sendKeys("Automation");

     
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("username"+ randomInt +"@gmail.com");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys("Test@123");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys("Test@123");
       
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']/option[5]")).click();
       
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']/option[4]")).click();
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']/option[4]")).click();

       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[phones][0][fulltelephonenumber]']")).sendKeys("+3456789012");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_submit']")).click();
       System.out.println("Passed");
       
       //Germany
       driver.get("https://www.olaz.de/de-de");
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//*[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']/div/a[2]")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_imgfemale']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[firstname]']")).sendKeys("Web");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[lastname]']")).sendKeys("Automation");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("test@auto.com");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys("Test@123");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys("Test@123");
       
       driver.findElement(By.xpath("*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']/option[5]")).click();
       
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']/option[5]")).click();
       

       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']/option[5]")).click();
     
       driver.findElement(By.xpath("*[@id='phdesktopbody_0_labelgrs_account[addresses][0][country]']")).click();
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_labelgrs_account[addresses][0][country]']/option[3]")).click();
       
       driver.findElement(By.xpath("*[@id=\"phdesktopbody_0_labelgrs_account[addresses][0][line1]\"]")).sendKeys("431,street");
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[addresses][0][postalarea]']")).sendKeys("Texas");
     
       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_labelgrs_account[addresses][0][city]']")).sendKeys("US");
       
       
       driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_labelgrs_account[addresses][0][city]\"]")).click();
       

    	//close Chrome
       
       driver.close();       
       
      
	}

}
