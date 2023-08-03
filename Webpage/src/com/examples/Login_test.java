package com.examples;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_test {
	
	
	WebDriver driver;
	
	public static void main(String[]args) {
		
		Login_test obj=new Login_test();
		
		obj.BrowserLaunch();
		obj.applicationLaunch();
		obj.loginfunctionality();
		//obj.closebroswer();
		}
	
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO T450\\eclipse-workspace\\Webpage\\Driverfiles\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	
	public void applicationLaunch()//webside link
	{
		
      driver.get("https://ems.vridhee.com/UI/Index/IndexRGS.php");
	
	}
	
	public void loginfunctionality() //Username,Passward,login button
	{
		driver.findElement(By.id("strEmailId")).sendKeys("jitendra@apexpie.com");
		driver.findElement(By.id("strPassword")).sendKeys("345Demo.school@4");
		driver.findElement(By.id("Employee")).click();
		WebElement button= driver.findElement(By.xpath("/html/body/div/div/form/div[4]/button"));
		button.click();
		
	}
}
	
	//public void closebroswer()
	
	//{
		//driver.close();
	//}
	

