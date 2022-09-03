package Module2_Fund;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageByModule {

	
	
	@FindBy (xpath = "//input[@placeholder='Search eg: infy bse, nifty fut weekly, gold mcx']") private WebElement searchStock;
	@FindBy (xpath = "//ul[@class='omnisearch-results']//li[1]") private WebElement BuyStock;
	@FindBy (xpath =  "//button[normalize-space()='B']") private WebElement clickBtn;
	@FindBy (xpath = "(//input[@type='number'])[1]") private WebElement enterquantity;
	@FindBy (xpath = "(//input[@type='number'])[1]") private static WebElement verifyQuantity;
	
	public HomepageByModule(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);	
		
	}
	
	public void setsearchStock(String stock)
	{
		
		searchStock.sendKeys(stock);
		
	}
	
	public void clickBystok(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		Actions act = new Actions (driver);
		act.moveToElement(BuyStock).perform();
		Thread.sleep(3000);
		
	}
	
	public void clickBuybtn()
	{
		
		clickBtn.click();
		
	}
	
	public static String verifybuyQuantity()
	{
		    WebElement qty = verifyQuantity;
		    String  value = qty.getAttribute("value");
		    return value;
	} 
	

	
	
	
}
