package asdas;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By; 




import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class safasc {

	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Desktop\\selenium files\\ChromeDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
            		
		driver.navigate().to("https://chromedriver.chromium.org/downloads/version-selection");

		
		
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File dest = new File("C:\\Users\\Shree\\Desktop\\ScreenShot\\4screenshot.jpg");
	  
	  
	   
	  FileUtils.copyFile(source, dest);
		
	  
	  //  to take the screenshot we need to downcast webdriver into takescreenshot interface then call the method getscreenshotas.
	  
	  //  getscreenshotas method takes the screenshot of current visible area of the browser 
	  
	  //  byusing outputType.file get screenshotas method returns object of file class (image info as a file ) 
	  
	  // after taking the screenshot it is stored in random memory so we need to copy that scrrenshot to user defined location so we need to create a object of file class for destinattion folder
	  
	  // by using fileutils we can copy image source to destination
	  
	  // 
	  
	}
	
}
