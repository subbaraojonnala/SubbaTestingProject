package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class PhoenixProjects_TC02 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\test\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
			
		driver.get("http://10.9.80.189:9001/login");
		
		driver.findElement(By.id("username")).sendKeys("kul_subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.className("btn")).click();
		
		 //driver.findElement(By.xpath("//a[@href='/projects']")).click();
		 
		driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-project\"]")).click();
		
				
		
		
		 driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[1]/fieldset[1]/div[2]/div/span/span/span[1]")).click();
		 
		 Thread.sleep(2000);
		 
		 List<WebElement> list = driver.findElements(By.xpath("/html/body/div[2]/main/div/div[1]/div/div[1]/div/div/div[1]/fieldset[1]/div[2]/div/span/span/span[1]"));
		
		 
		 
		 for(WebElement element:list)
		 {
			 System.out.println(element.getText());
			 if (element.getText().contains("BU1")) {
				 
				 element.click();
				 
				 break;
			 }
		 }
		
		driver.findElement(By.id("projectName")).sendKeys("PhoenixTC2");
		
		driver.findElement(By.id("projectCode")).sendKeys("PhoenixNameTC2");
		
		driver.findElement(By.id("sageCode")).sendKeys("PhoenixSageCodeTC2");
		
		driver.findElement(By.id("expectedOrderIntake")).sendKeys("11 July 2018");
		
		driver.findElement(By.id("expectedStartDate")).sendKeys("11 Apr 2019");
		driver.findElement(By.id("dateOfCompletion")).sendKeys("11 July 2020");
		driver.findElement(By.id("endOfWarranty")).sendKeys("11 July 2021");
		
		
		
		driver.findElement(By.id("contractValue")).sendKeys("1000000");
		driver.findElement(By.id("engineeringHour")).sendKeys("80");
		
		driver.findElement(By.id("exchangeRate")).sendKeys("1");
		
		driver.findElement(By.id("saveProjectButton")).click();
		
		
		     
		              
	
		/*String actualdata = driver.findElement(By.id("psi-alert")).getText();

		// System.out.println("Result: " + actualdata);

		String expdata = "Please correct the following error(s):";

		if (actualdata.contentEquals(expdata)) {*/

			System.out.println("PhoenixProjects_TC02");
	}
		
	
		}
		
		
		
		
		
		
		
		

