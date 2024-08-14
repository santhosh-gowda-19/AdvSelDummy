package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 
{
	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/Weekend_Test_Automation/HTML/Multipleframe/mainpage.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("abcd");
		driver.switchTo().frame("f1");
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("password");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("fr2");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("email");
	}

}
