package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook Book = WorkbookFactory.create(fis);
		Sheet sh = Book.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(0);
		String usn = cl.getStringCellValue();
		Cell cl1 = rw.getCell(1);
		String psw = cl1.getStringCellValue();
		WebElement  email = driver.findElement(By.id("email"));
		WebElement  password = driver.findElement(By.id("pass"));
		email.sendKeys(usn);
		password.sendKeys(psw);
		
		
		
		
		
		
		
		
		
		
	}

}
