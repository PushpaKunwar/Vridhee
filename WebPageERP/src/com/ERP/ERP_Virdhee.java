package com.ERP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ERP_Virdhee {
	WebDriver driver;
	
	@Test
	public void Setup()
	{
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chat.openai.com/");
		System.out.println("virdhee project");
	}
	
	@Test
	public void workspace1()
	{
		System.out.println("virdhee project1");
	}
	
	@Test
	public void workspace2()
	{
		System.out.println("virdhee project2");
	}

}
