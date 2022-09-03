package Module1_Login;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class kitezerodhalogin1page {

  @FindBy (xpath = "//input[@id='userid']") private WebElement userid;
  @FindBy (xpath = "//input[@id='password']") private WebElement pass;
  @FindBy (xpath = "//button[@type='submit']") private WebElement clickcontinuebtn;
  
  public kitezerodhalogin1page(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
	
	
  public void setuserid(String UID)
  {
	  userid.sendKeys(UID);
  }
	
  public void setpassword(String PWD)
  {
	  pass.sendKeys(PWD);
  }
  
  public void clickcontinuebtn()
  {
	  clickcontinuebtn.click();
  }
}
