package com.demoaut.newtours.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.lib.Radio;

public class InitiateDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
		WebElement element  = driver.findElement(By.name("userName"));
		element.sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
		Radio.radioClick(driver, "tripType", "oneway");
		Radio.radioClick(driver, "servClass", "Business");
		
	/*	driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("first");
		driver.findElement(By.name("lastName")).sendKeys("last");
		driver.findElement(By.name("phone")).sendKeys("99999999");
		driver.findElement(By.name("userName")).sendKeys("xyz@abc.com");
		driver.findElement(By.name("address1")).sendKeys("pimplesaudagar");
		driver.findElement(By.name("city")).sendKeys("pune");
		driver.findElement(By.name("state")).sendKeys("mh");
		driver.findElement(By.name("postalCode")).sendKeys("411027");
		Select options = new Select(driver.findElement(By.name("country")));
		options.selectByVisibleText("TAIWAN");
		driver.findElement(By.name("email")).sendKeys("test1");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("confirmPassword")).sendKeys("123");
		driver.findElement(By.name("register")).click();*/
		//driver.navigate().refresh();
		//driver.close();
		//driver.quit();
	}

}
