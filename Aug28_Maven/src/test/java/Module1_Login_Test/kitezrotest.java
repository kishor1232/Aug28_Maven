package Module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.baseclass;
import LibraryFiles.utilityclass;
import Module1_Login.kitezerodha3verifypage;
import Module1_Login.kitezerodhalogin1page;
import Module1_Login.kitezerodhalogin2page;
import Module1_Login.kitezerodhalogout;

public class kitezrotest extends baseclass {

	kitezerodhalogin1page login1;
	kitezerodhalogin2page login2;
	kitezerodha3verifypage home;
	int TESTCASEID;
	kitezerodhalogout logoutFromkitezero;
	
	
	
	@BeforeClass
	public void openapp()
	{
		openbrowser();
		driver.manage().window().maximize();
		login1 = new kitezerodhalogin1page(driver);
		login2 = new kitezerodhalogin2page(driver);
		home = new kitezerodha3verifypage(driver);
		
	}
	
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		
		login1.setuserid(utilityclass.getdatafromexcel(0,1));
		login1.setpassword(utilityclass.getdatafromexcel(0, 2));
		login1.clickcontinuebtn();
		
		login2.setpin(utilityclass.getdatafromexcel(0, 3));
		login2.clickonloginbtn();
		
		
	}
	@Test 
	public void TestCase2() throws EncryptedDocumentException, IOException
	{
		  TESTCASEID = 105;
		  String actPN = home.profilenaame();
		  String expPN = utilityclass.getdatafromexcel(0, 1);
		  Assert.assertEquals(actPN, expPN);
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			utilityclass.screenshots(driver, TESTCASEID);
		}
		
	}
	
	
	@AfterClass
	public void close() throws InterruptedException
	{
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	
}
