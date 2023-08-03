package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vridhee_webpage {
	public static void main(String[]args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO T450\\Downloads\\chromedriver-win64\\chromedriver-win64");
	  WebDriver driver= new ChromeDriver();
	 
	  driver.get("https://ems.vridhee.com/UI/loginUser.php");
	  WebElement usernameInput = driver.findElement(By.id("strEmailId"));
      WebElement passwordInput = driver.findElement(By.id("strPassword"));
      WebElement loginButton = driver.findElement(By.linkText("SIGN IN"));

      // Enter your login credentials here
      String username = "jitendra@apexpie.com";
      String password = "345Demo.school@4";

      // Enter the username and password
      usernameInput.sendKeys(username);
      passwordInput.sendKeys(password);

      // Click on the login button
      loginButton.click();

      // Wait for a few seconds to allow the login process to complete (you might need to use explicit waits in a real scenario)
    /*  try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }*/

      // Verify if the login was successful or not by checking the current URL or any other element on the page
     /* String currentUrl = driver.getCurrentUrl();
      if (currentUrl.equals("https://ems.vridhee.com/UI/homePage.php")) {
          System.out.println("Login successful!");
      } else {
          System.out.println("Login failed!");
      }

      // Close the browser*/
      driver.quit();
  }
}







	  
	  
	


