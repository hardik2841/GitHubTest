package tests.Page;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tests.Constant.ResultConstant;


public class TopFiveResultPage {	
	
	WebDriver driver=null;
	
	@FindBy(xpath=ResultConstant.RESULT_NAME1)
	WebElement name1;
	@FindBy(xpath=ResultConstant.RESULT_PRICE1)
	WebElement Price1;
	@FindBy(xpath=ResultConstant.RESULT_RATING1)
	WebElement Rating1;
	@FindBy(xpath=ResultConstant.RESULT_NAME2)
	WebElement name2;
	@FindBy(xpath=ResultConstant.RESULT_PRICE2)
	WebElement Price2;
	@FindBy(xpath=ResultConstant.RESULT_RATING2)
	WebElement Rating2;
	@FindBy(xpath=ResultConstant.RESULT_NAME3)
	WebElement name3;
	@FindBy(xpath=ResultConstant.RESULT_PRICE3)
	WebElement Price3;
	@FindBy(xpath=ResultConstant.RESULT_RATING3)
	WebElement Rating3;
	@FindBy(xpath=ResultConstant.RESULT_NAME4)
	WebElement name4;
	@FindBy(xpath=ResultConstant.RESULT_PRICE4)
	WebElement Price4;
	@FindBy(xpath=ResultConstant.SEARCH)
	WebElement Rating4;
	@FindBy(xpath=ResultConstant.RESULT_NAME5)
	WebElement name5;
	@FindBy(xpath=ResultConstant.RESULT_PRICE5)
	WebElement Price5;
	@FindBy(xpath=ResultConstant.RESULT_RATING5)
	WebElement Rating5;
	
	public TopFiveResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ResultDisplay() throws Throwable
	{
		String Re_Name1=name1.getText();
		Thread.sleep(1000);
		String Re_price1=Price1.getText();
		Thread.sleep(1000);
		String Re_Rating1=Rating1.getText();
		Thread.sleep(1000);
		
		String Re_Name2=name2.getText();
		Thread.sleep(1000);
		String Re_price2=Price2.getText();
		Thread.sleep(1000);
		String Re_Rating2=Rating2.getText();
		Thread.sleep(1000);
		
		
		String Re_Name3=name3.getText();
		Thread.sleep(1000);
		String Re_price3=Price3.getText();
		Thread.sleep(1000);
		String Re_Rating3=Rating3.getText();
		Thread.sleep(1000);
		
		String Re_Name4=name4.getText();
		Thread.sleep(1000);
		String Re_price4=Price4.getText();
		Thread.sleep(1000);
		String Re_Rating4=Rating4.getText();
		Thread.sleep(1000);
		
		String Re_Name5=name5.getText();
		Thread.sleep(1000);
		String Re_price5=Price5.getText();
		Thread.sleep(1000);
		String Re_Rating5=Rating5.getText();
		Thread.sleep(1000);
		
		String []N={Re_Name1,Re_Name2,Re_Name3,Re_Name4,Re_Name5};
		String []p={Re_price1,Re_price2,Re_price3,Re_price4,Re_price5};
		String []Ra={Re_Rating1,Re_Rating2,Re_Rating3,Re_Rating4,Re_Rating5}; 
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Name Of Company:"+N[i]);
			System.out.println("Price Of Case:"+p[i]);
			System.out.println("Rationg of Case:"+Ra[i]);
		}
		
		Arrays.sort(p);
        
        System.out.println("String array sorted (case sensitive)");
       
        //print sorted elements
        for(int i=0; i <4; i++){
                System.out.println(p[i]);
        }
		 
	}
	

	

}
