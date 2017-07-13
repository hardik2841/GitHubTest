package tests.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tests.Constant.HomePageConstant;

public class HomePage  {
	
	WebDriver driver=null;
	@FindBy(xpath=HomePageConstant.SEARCHBOX_ELE)
	WebElement Search;
	@FindBy(xpath=HomePageConstant.SEARCHBOX_NEXT)
	WebElement SearchNext;
	
	
	
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSearch(String searchName) throws Throwable
	{
		Search.sendKeys(searchName);
		Thread.sleep(2000);
		SearchNext.click();
		Thread.sleep(2000);
		
	}
	
}

