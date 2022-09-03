package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitezerodha3verifypage {

	@FindBy (xpath = "//span[@class='user-id']") private WebElement profile;
	
	public kitezerodha3verifypage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public String profilenaame()
	{
		
		 String actPN = profile.getText();
		
		 return actPN;
		
	}
	
}

