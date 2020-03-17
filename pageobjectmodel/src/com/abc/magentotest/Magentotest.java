
package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobject.Home;
import com.abc.magentoobject.Login;
import com.abc.magentoobject.Welcome;

public class Magentotest 
{
	public static void main(String[] args) 
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.magento.com");
        Welcome w=new Welcome(driver);
		w.clickonMyAccount();
		Login l=new Login(driver);
		l.typeElement("33sl14me051128128@gmail.com");
		l.typepass("Arunkumar@123");
		l.clickonLogin();
		Home h=new Home(driver);
	    h.clickonLogout();
	    driver.quit();
	}

}
