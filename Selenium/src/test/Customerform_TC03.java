package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customerform_TC03 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver-v0.24.0-win64\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
		
		driver.get("http://10.9.80.189:9001/login");
		
		driver.findElement(By.id("username")).sendKeys("kul_srikanth");
		
		driver.findElement(By.id("password")).sendKeys("psi321");
		
		driver.findElement(By.className("btn")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[2]/a")).click();
		
		//driver.findElement(By.id("add-company")).click();
		driver.findElement(By.xpath("	//*[@id=\"add-company\"]")).click();
	
		
		
		driver.findElement(By.id("name")).sendKeys("TNB2");
		
		driver.findElement(By.id("code")).sendKeys("TNB21");
		driver.findElement(By.id("pentaCode")).sendKeys("TNB213");
		
		driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[2]/div/form/div[4]/div/span/span/span[1]")).click();
		 
		 Thread.sleep(2000);
		 
		 List<WebElement> list = driver.findElements(By.xpath("/html/body/div[2]/main/div/div/div/div[2]/div/form/div[4]/div/span/span/span[1]"));
		
		 
		 
		 for(WebElement element:list)
		 {
			 System.out.println(element.getText());
			 if (element.getText().contains("Active")) {
				 
				 element.click();
				 
				 break;
			 }
		 }
		
			driver.findElement(By.id("save-button")).click();
		
		
		
		System.out.println("Customerform_TC03");
		
		
		}

}
