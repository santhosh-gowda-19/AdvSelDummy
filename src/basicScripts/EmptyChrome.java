package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyChrome
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.chrome.driver";//specify type of browser
		String value = "./Software/chromedriver.exe";//specify path of the driverfile
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();//launch emptychrome browser
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		String src = driver.getPageSource();
		System.out.println(src);
		driver.quit();
	}

}
