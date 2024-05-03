import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


class Project1{
	public static void main(String args[])
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();	
	driver.get("https://www.newel.com/product/pair-of-carl-malmsten-art-deco-swedish-inlaid-high-back-upholstered-armchairs");
	
	driver.findElement(By.xpath("(//button[@class='cust-btn cust-inq'])[2]")).click();
	
	driver.findElement(By.id("first_name")).sendKeys("Omkar");last_name
			(//input[@name='email'])[1]
			//textarea[@id='message']
	
	
	}
}
