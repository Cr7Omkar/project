package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {
		public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PRANIL\\Desktop\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("https://www.magicbricks.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class=\"mb-search__btn\"]")).click();
			Thread.sleep(5000);
			List<WebElement> priceList =  driver.findElements(By.xpath("//div[@class='mb-srp__card__price--amount']"));
//		
//             for(WebElement listOfElement : listOfElements) {
//            	
//            	 System.out.println(listOfElement.getText());
//                   
//            }
			
			int listno = priceList.size();
			System.out.println(listno);
	        Thread.sleep(2000);
	        String[] priceLists= new String[priceList.size()];
	        Thread.sleep(2000);
	    
	        for(int i=0;i<priceList.size();i++)
	        {
	        	
	        	priceLists[i]=priceList.get(i).getText().replace("₹", "").replace("Cr", " ").replace("Lac", " ");
       
	        }
	       ArrayList<String> arr = new ArrayList<String>(Arrays.asList(priceLists));
	       Collections.sort(arr,Collections.reverseOrder());
	       
	       for(String s : arr)
	       {
	    	   System.out.println(s);
	       }



			WebElement element = driver.findElement(By.xpath("(//div[@class='mb-srp__card__price--amount'])[4]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(5000); 
			String parent= driver.getWindowHandle();
            driver.findElement(By.xpath(" 	(//div[@class='mb-srp__card__price--amount'])[5]")).click();          
            Set<String> handles = driver.getWindowHandles();
             for(String handle : handles)
            	if(!handle.equals(parent))
            	{
            		driver.switchTo().window(handle);
            		Thread.sleep(5000);
            		driver.findElement(By.xpath("//button[text()='Get Phone No.']")).click();
                    driver.findElement(By.id("userName")).sendKeys("OMKAR");
                    driver.findElement(By.id("userEmail")).sendKeys("ABC@gmail.com");
                    driver.findElement(By.id("userMobile")).sendKeys("8169412728");
                    Thread.sleep(3000); 
                    driver.findElement(By.xpath("//button[@type='submit']")).click();

            	}

			
		}
		
}
