package asdas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Table {

	public static void main(String[] args) throws InterruptedException {
		
		
		 
				
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Desktop\\selenium files\\ChromeDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
					driver.get("https://www.w3schools.com/html/html_tables.asp");
					Thread.sleep(5000);
					WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
					
					List<WebElement> row = table.findElements(By.tagName("tr"));
					int a = row.size();
					System.out.println(a);
					
					
					for(int i=0; i< a; i++) {
						List<WebElement> col = row.get(i).findElements(By.tagName("td"));
						int b = col.size();
						for(int j= 0; j<b; j++) {
							System.out.println(col.get(j).getText());
						}
					}
				
			
		
		

	}

}
