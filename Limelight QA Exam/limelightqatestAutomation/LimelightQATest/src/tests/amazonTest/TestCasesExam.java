package tests.amazonTest;
import static org.testng.Assert.assertEquals;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Core.BaseTest;
import tests.Page.HomePage;
import tests.Page.RefineSearchPage;
import tests.Page.TopFiveResultPage;

	public class TestCasesExam extends BaseTest{
			  
			 

			  
			  @Test(priority=0,enabled=false)
			  public void FirstTest() throws Throwable
			  {
				  HomePage p=new HomePage(driver);
				  p.ClickOnSearch("ipad air 2 case");
				  assertEquals( driver.getTitle(),"Amazon.com: ipad air 2 case - Cases / Bags, Cases & Sleeves: Electronics");
			  }
			  
			  
			  @Test(priority=1,enabled=false)
			  public void SearchtestforPlastic() throws Throwable
			  {
				  driver.get("https://www.amazon.com/s/ref=nb_sb_noss_1/134-9748141-0699241?url=search-alias%3Daps&field-keywords=ipad+air+2+case");
				  Thread.sleep(2000);
				  RefineSearchPage rp=new RefineSearchPage(driver);
				  rp.ClickOnPlastic();
				  assertEquals( driver.getTitle(),"Amazon.com: ipad air 2 case - Plastic / Cases / Bags, Cases & Sleeves: Electronics");
			  }
			  
			  
			  @Test(priority=2,enabled=false)
			  public void Searchtestfor_PriceMatch() throws Throwable
			  {
				  driver.get("https://www.amazon.com/s/ref=nb_sb_noss_1/134-9748141-0699241?url=search-alias%3Daps&field-keywords=ipad+air+2+case");
				  Thread.sleep(2000);
				  RefineSearchPage rp=new RefineSearchPage(driver);
				  rp.InputOnPrice("20", "100");
				  assertEquals( driver.getTitle(),"Amazon.com: ipad air 2 case - $20-$100 / Cases / Bags, Cases & Sleeves: Electronics");
				  
				  
			  }
			  @Test(priority=3)
			  public void Show_Result_Top5() throws Throwable
			  {
				  driver.get("https://www.amazon.com/s/ref=sr_nr_p_36_5?rnid=386442011&keywords=ipad+air+2+case&fst=p90x%3A1&rh=n%3A172282%2Cn%3A541966%2Cn%3A2348628011%2Cn%3A2348629011%2Cn%3A3012929011%2Ck%3Aipad+air+2+case&qid=1499939434&low-price=20&high-price=100");
				  Thread.sleep(2000);
				  TopFiveResultPage Top=new TopFiveResultPage(driver);
				  Top.ResultDisplay();
				  assertEquals( driver.getTitle(),"Amazon.com: ipad air 2 case - $20-$100 / Cases / Bags, Cases & Sleeves: Electronics");
				  
				  
			  }
			  @Test(priority=4,enabled=false)
			  public void BestOfProduct()
			  {
				  
			  }
			 
			}
		




