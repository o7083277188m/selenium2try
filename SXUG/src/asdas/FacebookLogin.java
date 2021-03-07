package asdas;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

////div[@class='stats-block holdings']//div[@class='row']//span[1]


public class FacebookLogin {
	

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Desktop\\selenium files\\ChromeDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//name="firstname"  // name="lastname"   		
		driver.navigate().to("https://www.facebook.com/r.php");
		
		//id="day" //id="month"
		

	       WebElement day_dropdown=driver.findElement(By.name("birthday_day"));
	       
	       Select day_dd = new Select(day_dropdown);
	       
	       day_dd.selectByValue("11");
		
		
		
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
       Select Month_dd = new Select(month_dropdown);
       
       Month_dd.selectByIndex(5);
       
       

      WebElement Year_dropdown=driver.findElement(By.name("birthday_year"));
       
       Select Year_dd = new Select(Year_dropdown);
       
       Year_dd.selectByIndex(4);
       
       WebElement Radio_button_Custom =driver.findElement(By.xpath("//input[@id='u_0_6']"));
       
       Radio_button_Custom.click();
       
     Thread.sleep(2000);
       
     
     
     WebElement gender =driver.findElement(By.xpath("//input[@id='u_0_12']"));
     
     gender.sendKeys("Male");
     
     WebElement preferred_pronoun_dropdown=driver.findElement(By.xpath("//select[@name='preferred_pronoun'][1]"));
       
       Select preferred_pronoun_dd = new Select(preferred_pronoun_dropdown);
       
       preferred_pronoun_dd.selectByIndex(1);
      
       
	}

}
