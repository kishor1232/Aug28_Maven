package LibraryFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass
{
	
	public WebDriver driver;
	
	public void openbrowser()
	{
		
		System.setProperty("webdriver.gecko.driver","F:\\Aug28_Maven\\Aug28_Maven\\Browsers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://kite.zerodha.com");
		
		driver.manage().window().maximize();
	}
	
}