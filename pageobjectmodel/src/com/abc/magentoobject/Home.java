package com.abc.magentoobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

        WebDriver driver;
        By Logout=By.xpath("//a[text()='Log Out']");
       // WebElement Logout= driver.findElement(By.className("account"));
        public Home(WebDriver driver) 
    	{
    		this.driver=driver;
    		
    	}
       
        public void clickonLogout()
        {
        	driver.findElement(Logout).click();
        }
	}
