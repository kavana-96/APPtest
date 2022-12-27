package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
	WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
