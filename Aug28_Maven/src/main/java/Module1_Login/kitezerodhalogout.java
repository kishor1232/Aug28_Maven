package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitezerodhalogout {

	@FindBy (xpath ="//span[@class='user-id']") private WebElement clickPN;
	@FindBy (xpath =  "//span[@class='icon icon-exit']") private WebElement logout;
	
	public kitezerodhalogout(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
		
	}
	
	public void clickprofile()
	{
		
		clickPN.click();
		
	}
	
	
	
	public void logoutfromKitezerodha()
	{
		logout.click();
	}










}
