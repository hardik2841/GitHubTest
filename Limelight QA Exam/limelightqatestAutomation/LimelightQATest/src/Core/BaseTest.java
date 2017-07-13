package Core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
  
  protected WebDriver driver=null;
  
  @BeforeMethod
  public void setUp() throws Exception{
	  System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	  
	//  driver= new FirefoxDriver();
		 driver.get("https://www.amazon.com/");
		 Thread.sleep(2000);
		 assertEquals( driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");

  }

  @AfterMethod
  public void tearDown(){
      driver.quit();
  }

}
