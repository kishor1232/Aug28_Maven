package Module1_Login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitezerodhalogin2page {

	@FindBy (xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement clicklgnbtn;
	
	public kitezerodhalogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setpin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void clickonloginbtn()
	{
		clicklgnbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
