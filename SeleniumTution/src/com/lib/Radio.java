package com.lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radio {

	public static void radioClick(WebDriver driver ,String radioname , String value){
		List<WebElement> radios= driver.findElements(By.name(radioname));
		 System.out.println(radios.size());
		for(int i=0;i<radios.size();i++){
			System.out.println(radios);
						if(radios.get(i).getAttribute("value").equalsIgnoreCase(value))
							radios.get(i).click();
		}
	}
}
