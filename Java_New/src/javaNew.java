
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class javaNew {
	public static void main(String[] j) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
      
        //close Fire fox
        driver.close();
	}


}
