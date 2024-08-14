package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class demo 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ST = driver.findElement(By.xpath("//input[@name='q']"));
		ST.sendKeys("Mobiles",Keys.ENTER);
		WebElement product = driver.findElement(By.xpath("//div[.='Motorola G34 5G (Ocean Green, 128 GB)']"));
		product.click();
		Thread.sleep(2000);
		Set<String> wins = driver.getWindowHandles();
		int count = wins.size();//2
		System.out.println(count);//2
		ArrayList<String> list = new ArrayList<>(wins);
		String CB1 = list.get(1);
		driver.switchTo().window(CB1);		
		WebElement kart =  driver.findElement(By.xpath("//span[text()='Cart']"));
		Actions act = new Actions(driver);
		act.contextClick(kart).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
	}
	}

