package Module3_Profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wishList_add_and_remove {

	@FindBy (xpath =  "//input[@type='text']") private WebElement searchStock;
	@FindBy (xpath =  "//ul[@class='omnisearch-results']//li[1]")private WebElement stock;
	@FindBy (xpath = "//ul[@class='omnisearch-results']//button[5]") private WebElement verifyaddButton;
	@FindBy (xpath = "//ul[@class='omnisearch-results']//button[5]") private WebElement clickaddBtn;
	@FindBy (xpath = "//ul[@class='omnisearch-results']//button[5]") private WebElement verifyadded;
	
	public wishList_add_and_remove(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void kirezerosearch()
	{
		searchStock.sendKeys("tcs");
	}
	
	public void kitezerostock()
	{
		stock.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
