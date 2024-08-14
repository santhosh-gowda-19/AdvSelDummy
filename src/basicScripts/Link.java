package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/Weekend_Test_Automation/HTML/DummyPage.html");
		WebElement cb = driver.findElement(By.cssSelector("input[id='cb']"));
		cb.click();
	}

}
