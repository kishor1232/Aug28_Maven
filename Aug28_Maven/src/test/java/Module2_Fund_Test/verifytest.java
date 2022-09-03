package Module2_Fund_Test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.baseclass;
import LibraryFiles.utilityclass;
import Module1_Login.kitezerodhalogin1page;
import Module1_Login.kitezerodhalogin2page;
import Module2_Fund.HomepageByModule;
import Module2_Fund.homepage;
import junit.framework.Assert;

public class verifytest extends baseclass

{
		kitezerodhalogin1page login1;
		kitezerodhalogin2page login2;
		homepage page4;
		int TCID ;
	
	@BeforeClass
		public void openapplication()
		{
		openbrowser();
		login1 = new kitezerodhalogin1page(driver);
		login2 = new kitezerodhalogin2page(driver);
		page4 = new homepage(driver); 
		}
			
		@BeforeMethod
		public void login() throws EncryptedDocumentException, IOException, InterruptedException
		{
			login1.setuserid(utilityclass.getdatafromexcel(0, 1));
			login1.setpassword(utilityclass.getdatafromexcel(0, 2));
			login1.clickcontinuebtn();
			
			login2.setpin(utilityclass.getdatafromexcel(0, 3));
			login2.clickonloginbtn();
			page4.movetoStock(driver);
			
		}
	
		@Test
		public void TC1() throws EncryptedDocumentException, IOException 
		{
		TCID = 102;
		String actbuybtnText = page4.cheakBuyBtn();
		String expbuybtnText = utilityclass.getdatafromexcel(0, 6);
		Assert.assertEquals( expbuybtnText, actbuybtnText);
		
		 String actsellbtnText = page4.cheaksellbtn();
		 String expsellbynText = utilityclass.getdatafromexcel(0, 7);
		 Assert.assertEquals(expsellbynText,actsellbtnText );
		 
		 String actmarketdepthbtnText = page4.cheakmarketdepthbtn();
		 String expmarketdepthbynText = utilityclass.getdatafromexcel(0,8);
		 Assert.assertEquals(expmarketdepthbynText,actmarketdepthbtnText );
		 
		 String actchartbtnText = page4.cheakChartBtn();
		 String expchartbynText = utilityclass.getdatafromexcel(0, 9);
		 Assert.assertEquals(expchartbynText,actchartbtnText );
		 
		 String actdelbtnText = page4.cheakdelbtn();
		 String expdelbynText = utilityclass.getdatafromexcel(0, 10);
		 Assert.assertEquals(expdelbynText,actdelbtnText );
		}
			
		@AfterMethod
		public void logout(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				utilityclass.screenshots(driver, TCID);
			}
		}
		
		@AfterClass
		public void close() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.quit();	
		}

}
