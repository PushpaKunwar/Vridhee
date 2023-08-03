package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Studentmanager {
WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		
		//setup chrome and website
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO T450\\eclipse-workspace\\Webpage\\Driverfiles\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://ems.vridhee.com/UI/Index/IndexRGS.php");
	
	
	
	  //webelement test
		driver.findElement(By.id("strEmailId")).sendKeys("jitendra@apexpie.com");
		driver.findElement(By.id("strPassword")).sendKeys("345Demo.school@4");
		driver.findElement(By.id("Employee")).click();
		WebElement button= driver.findElement(By.xpath("/html/body/div/div/form/div[4]/button"));
		button.click();
		
	
	//student manager test
    	WebElement StudentManager=driver.findElement(By.linkText("Student Manager"));
    	Actions Studmanager= new Actions(driver);
    	Studmanager.moveToElement(StudentManager).build();
    	StudentManager.click();
    	
    	//student add and edit test
    	
    	WebElement StudentEditandAdd=driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[11]/ul/li[4]/a/i"));
    	StudentEditandAdd.click();
    	
    	//student school element test
    	//WebElement School= driver.findElement(By.id("select2-intInsId-container"));
    	//WebElement School= driver.findElement(By.linkText("Select School") );
    	////Select SelectSchool= new Select(School);
    	//SelectSchool.selectByVisibleText("SNIS");
    	WebElement School= driver.findElement(By.tagName("b"));
    	School.click();
    	
    	
    	
    	
    	Thread.sleep(10000);
    	
    	//student session test
    	driver.findElement(By.id("select2-intSession-container")).click();
    	Thread.sleep(10000);
    	
    	//student class element test
    	driver.findElement(By.id("select2-intCourseInsId-container")).click();
    	
    	
    	
    	//+student element test
    	

    	driver.findElement(By.xpath("/html/body/div/div/section[2]/div[2]/table/tbody/tr[1]/th[6]/a[1]")).click();
    	
    	
    	//Student name test
    	//student name
    	WebElement Studentname=driver.findElement(By.xpath("/html/body/div/div/div/form/div/div[1]/div[1]/div/input"));
    	Actions Studname= new Actions(driver);
    	Studname.moveToElement(Studentname).build();
    	Studentname.click();
    	Studentname.sendKeys("pushpa");
    	
    	//email id test
    	//driver.findElement(By.xpath("/html/body/div/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("Pushpa@gmail.com");
    	WebElement Emailid=driver.findElement(By.xpath("select2-intSession-container"));
    	Actions id = new Actions(driver);
    	id.moveToElement(Emailid).build();
    	Emailid.click();
    	Emailid.sendKeys("pushpa@gmail.com");
    	
    	//save and continue button test
    	driver.findElement(By.xpath("/html/body/div/div/div/form/div/div[3]/div/div/button[1]")).click();
          
}
        //public void closebroswer()
	
  	//{
  		//driver.close();
  	//}
  	
}

