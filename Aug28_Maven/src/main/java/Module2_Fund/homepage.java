package Module2_Fund;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class homepage {

	@FindBy (xpath =  "(//span[@class='symbol'])[1]") private WebElement stock;
	@FindBy (xpath =  "((//span[@class='actions'])//span[1])[1]") private static WebElement buyBtn;
	@FindBy (xpath =  "((//span[@class='actions'])//span[2])[1]") private  static WebElement sellBtn;
	@FindBy (xpath =  "((//span[@class='actions'])//span[3])[1]") private static WebElement marketdepth;
	@FindBy (xpath = "((//span[@class='actions'])//span[4])[1]") private static WebElement chartBtn;
	@FindBy (xpath =  "((//span[@class='actions'])//span[5])[1]") private static WebElement delBtn;
	
	

	public homepage(WebDriver driver) 
		{
		PageFactory.initElements(driver  , this);
	    }
	
		public void movetoStock(WebDriver driver)
		{
		Actions act = new Actions(driver);	
		act.moveToElement(stock).perform();
		}

			public static String cheakmarketdepthbtn()
			{
				
				String value = marketdepth.getAttribute("data-balloon");
				return value;
				
			}
		
		public  static String cheakBuyBtn()
		{
			 String value = buyBtn.getDomAttribute("data-balloon");
			 
			 return value;
		}
		
		public static String cheaksellbtn()
		{
			String value = sellBtn.getAttribute("data-balloon");
			return value;
			
		}
		
		public static String cheakChartBtn()
		{
		
			String value = chartBtn.getAttribute("data-balloon");
			return value;
			
		}
		
		public static String cheakdelbtn()
		{
			 String value = delBtn.getAttribute("data-balloon");
			 return value;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}

