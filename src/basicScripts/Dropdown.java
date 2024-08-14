package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Dropdown 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//button[text()='Log in']"));
		File temp = element.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Defects/element1.png");
		FileHandler.copy(temp, perm);
		Date d = new Date();
		String d1 = d.toString().replace(":","-");
		System.out.println(d1);
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
