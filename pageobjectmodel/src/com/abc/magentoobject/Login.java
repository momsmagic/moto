package com.abc.magentoobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By email=By.xpath("//input[@id='email']");
	By pass=By.xpath("//input[@id='pass']");
	By Login=By.xpath("//button[@id='send2']");
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeElement(String em)
	{
		driver.findElement(email).sendKeys(em);
	}
	public void typepass(String pwd)
	{
		driver.findElement(pass).sendKeys(pwd);
	}
    public void clickonLogin()
    {
    	driver.findElement(Login).click();
    }
}

