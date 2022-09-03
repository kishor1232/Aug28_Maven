package Module2_Fund_Test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
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

public class quantityverify extends baseclass

{
		kitezerodhalogin1page login1;
		kitezerodhalogin2page login2;
		HomepageByModule buyStock;
		homepage page4;
		int TCID ;
	
	@BeforeClass
		public void openapplication()
		{
		openbrowser();
		
		login1 = new kitezerodhalogin1page(driver);
		login2 = new kitezerodhalogin2page(driver);
		buyStock = new HomepageByModule(driver);
		}
			
		@BeforeMethod
		public void login() throws EncryptedDocumentException, IOException, InterruptedException
		{
			
			login1.setuserid(utilityclass.getdatafromexcel(0, 1));
			login1.setpassword(utilityclass.getdatafromexcel(0, 2));
			login1.clickcontinuebtn();
			
			login2.setpin(utilityclass.getdatafromexcel(0, 3));
			login2.clickonloginbtn();
			
			buyStock.setsearchStock(utilityclass.getdatafromexcel(0, 4));
			buyStock.clickBystok(driver);
			buyStock.clickBuybtn();
			buyStock.verifybuyQuantity();
		
		}
	
		@Test
		public void TC1() throws EncryptedDocumentException, IOException 
		{
		TCID = 101;
		
		 String  actText = buyStock.verifybuyQuantity();						
		 String expText = utilityclass.getdatafromexcel(0, 5);
		 
		 Assert.assertEquals(actText, expText);
		}
			
		@AfterMethod
		public void logout(ITestResult result) throws IOException
		{
			
			if(result.getStatus()==ITestResult.FAILURE)
			{
				utilityclass.screenshots(driver, TCID);
			}
			
			driver.navigate().to("https://www.google.com");;
			
		}
		
		@AfterClass
		public void close() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.quit();	
			
		}

}
