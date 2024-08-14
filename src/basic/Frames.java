package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSPR/Desktop/Weekend_Test_Automation/HTML/mainpage.html");
	Thread.sleep(2000);
	WebElement usn = driver.findElement(By.id("usn"));
	usn.sendKeys("abcd");
	driver.switchTo().frame(0);//switch to frame1
	WebElement frm2 = driver.findElement(By.xpath("//iframe[@src='Frame2.html']"));
	driver.switchTo().frame(frm2);//switch to frame2
	Thread.sleep(2000);
	WebElement cpsw = driver.findElement(By.id("fr3"));
	cpsw.sendKeys("xyz");//perform action inside frame2
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.findElement(By.id("psw")).sendKeys("jksdshdg");
	
	
	
	
	
	
	
	}
}
