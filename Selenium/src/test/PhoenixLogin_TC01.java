package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhoenixLogin_TC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instansiate Chrome Browser Driver

		System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		// Create Chrome browser Driver

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://10.9.80.189:9001/login");
		driver.findElement(By.id("username")).sendKeys("kul_subbarao");
		driver.findElement(By.id("password")).sendKeys("Subbarao1516");
		driver.findElement(By.className("btn")).click();
		
		//driver.findElement(By.xpath ("/html/body/div/div/div[2]/div/form/fieldset/div[3]/button")).click();
		
		

		// driver.findElement(By.XPath("//a[@href='/projects']")).click();

		String url = driver.getCurrentUrl();

		if (url.equals("http://10.9.80.189:7777/")) {

			System.out.println("Subbarao Login- PhoenixLogin_TC01-Passed");

		} else {
			System.out.println("Subbarao Login- Failed");

		}

	}

}

