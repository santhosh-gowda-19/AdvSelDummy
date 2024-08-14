package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/Weekend_Test_Automation/HTML/DummyPage.html");
		WebElement usn = driver.findElement(By.id("usn"));
		WebElement psw = driver.findElement(By.name("pw"));
		WebElement checkbox = driver.findElement(By.className("c3"));
		WebElement RB = driver.findElement(By.id("rb"));
		WebElement link = driver.findElement(By.className("c4"));
		usn.sendKeys("abcd@gmail.com");
		psw.sendKeys("xyz@1234");
		checkbox.click();
		RB.click();
		usn.clear();
		link.click();
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
