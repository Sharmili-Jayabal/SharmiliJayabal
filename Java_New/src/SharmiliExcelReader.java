import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.TestListener;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SharmiliExcelReader {
	
	FileInputStream fis=null;
	public FileOutputStream fileOut=null;
	private XSSFWorkbook workbook=null;
	private XSSFSheet sheet=null;
	private XSSFRow row=null;
	private XSSFCell cell=null;
	 static String path= null;

	 //Constructor
	 public SharmiliExcelReader() throws IOException{
	path =System.getProperty("user.dir")+("\\src\\TestData\\Testdata.xlsx");
	fis = new FileInputStream(path);
	workbook =new XSSFWorkbook(fis);
	sheet=workbook.getSheetAt(0);
	 }
	 
	 public int getSheetRows(String sheetName) {
		 int index=workbook.getSheetIndex(sheetName);
		 sheet=workbook.getSheetAt(index);
		return (sheet.getLastRowNum()+1);
	 }
	 
	 public int getSheetColumns(String sheetName) {
		 int index=workbook.getSheetIndex(sheetName);
		 sheet=workbook.getSheetAt(index);
		 row=sheet.getRow(0);
		return (row.getLastCellNum());
	 }
	 
	 public String getCellData(String sheetName,int colNum, int rowNum) {
		int index = workbook.getSheetIndex(sheetName);
		sheet=workbook.getSheetAt(index);
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		 return (cell.getStringCellValue());
		 }
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		SharmiliExcelReader reader = new SharmiliExcelReader();
	 
		String data = reader.getCellData("Test1", 0, 1);
		String data1=reader.getCellData("Test1", 1, 1);
		System.out.println(reader.getSheetRows("Test1"));
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sharmilee\\Downloads\\geckodriver-v0.26.0-win64\\GeckoDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette",true); 
		WebDriver  driver = new FirefoxDriver();
		  
	       path =System.getProperty("user.dir")+("\\src\\TestData\\Testdata.xlsx");
	       

	       driver.get("https://www.olay.co.uk/en-gb");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//*[@class='event_profile_register'])[1]")).click();
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys(data);
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys(data1);
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys(data1);
	       
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")).click();
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']/option[2]")).click();
	       
	       driver.findElement(By.xpath("(//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]'])[1]")).click();
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']/option[5]")).click();
	       
	       driver.findElement(By.xpath("//*[@id='onetrust-reject-all-handler']")).click();

	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")).click();
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']/option[4]")).click();
	       
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_submit']")).click();

		}


}
