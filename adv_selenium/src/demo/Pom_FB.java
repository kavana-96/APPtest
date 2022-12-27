package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_FB 
{
	@FindBy(id="email")
	private WebElement tx1;
	@FindBy(id="pass")
	private WebElement tx2;
	@FindBy(name="login")
	private WebElement Bt2;
	
	Pom_FB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Button1()
	{
		Bt2.click();
	}
	public void Datapass()
	{
		tx1.sendKeys("9535235562");
		tx2.sendKeys("Bharath@2789");
	}
}
