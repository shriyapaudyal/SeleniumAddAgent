package com.braindigit.AddAgent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddAgentClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\backup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://lb25.braindigit.com/qa18/");


		driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
		driver.findElement(By.id("modlgn-username")).clear();
		driver.findElement(By.id("modlgn-username")).sendKeys("shriya");
		driver.findElement(By.id("modlgn-passwd")).clear();
		driver.findElement(By.id("modlgn-passwd")).sendKeys("brain");
		driver.findElement(By.id("modlgn-passwd")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("html/body/div[1]/aside/div/section/ul/li[4]/a[contains(.,'Agents')]")).click();
		Thread.sleep(5000);
			for(int i=0;i<=2;i++)
			{
					Thread.sleep(9000);
			
				driver.findElement(By.xpath("html/body/div[1]/div/section[2]/form/div[2]/div[1]/div/a[contains(.,'New')]")).click() ;
				Thread.sleep(8000);
				
				driver.findElement(By.id("internal_id")).sendKeys("selenium"+i);

				driver.findElement(By.id("username")).sendKeys("lina"+i);
				driver.findElement(By.id("email")).sendKeys("selenium"+i+"@mail.com");
				driver.findElement(By.id("password")).sendKeys("brain");

				driver.findElement(By.id("password2")).sendKeys("brain");
				driver.findElement(By.id("name")).sendKeys("selenium"+i);
				Thread.sleep(2000);
				
				Select state = new Select(driver.findElement(By.id("user_region")));
				state.selectByVisibleText("New South Wales");
				Thread.sleep(2000);
				Select region = new Select(driver.findElement(By.id("area_id")));
				region.selectByVisibleText("- Sydney CBD");
				
				driver.findElement(By.name("saveAgent")).click();
				Thread.sleep(10000);
				
				driver.navigate().refresh();
				
			}
	}

}
