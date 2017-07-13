	package tests.Page;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import tests.Constant.HomePageConstant;

	public class RefineSearchPage {
		
		WebDriver driver=null;
		@FindBy(xpath=HomePageConstant.REFINE_SEARCH_PLASTIC)
		WebElement Search_For_Plastic;
		@FindBy(id=HomePageConstant.REFINE_SEARCH_20)
		WebElement Input_20;
		@FindBy(id=HomePageConstant.REFINE_SEARCH_100)
		WebElement Input_100;
		@FindBy(xpath=HomePageConstant.REFINE_SEARCH_GO)
		WebElement Go;
		
		
		
		
		public  RefineSearchPage (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void ClickOnPlastic() throws Throwable
		{
			Search_For_Plastic.click();
			Thread.sleep(2000);
			
		}
		public void InputOnPrice(String price1,String price2) throws Throwable
		{
				Input_20.sendKeys(price1);
				Input_100.sendKeys(price2);
				Thread.sleep(2000);
				//driver.get("https://www.amazon.com/s/ref=sr_nr_p_36_5?rnid=386442011&keywords=ipad+air+2+case&fst=p90x%3A1&rh=n%3A172282%2Cn%3A541966%2Cn%3A2348628011%2Cn%3A2348629011%2Cn%3A3012929011%2Ck%3Aipad+air+2+case&qid=1499939434&low-price=20&high-price=100");
				Go.click();
				Thread.sleep(2000);
		
		}
}
