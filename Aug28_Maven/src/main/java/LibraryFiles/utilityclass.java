package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openxmlformats.schemas.drawingml.x2006.chart.STTickLblPos;

public class utilityclass {

	
	public static String getdatafromexcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\Aug28_Maven\\Aug28_Maven\\TestData\\TestNG file.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("kitezerodha").getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	
	}
	
	
	public static void screenshots(WebDriver driver, int TESTCASEID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ("F:\\Aug28_Maven\\Aug28_Maven\\Screenshots\\kitezero"+TESTCASEID+".png");
		
		FileHandler.copy(src, dest);
		
		
		
		
	}
	
	
	
}
