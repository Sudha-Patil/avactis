package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class InCookbookRadioandCheckbox {
	WebDriver driver;
  @Test
  public void selectRadioAndCheckbox() throws InterruptedException {
	  driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  WebElement radio=driver.findElement(By.xpath("//input[@value='Diesel']"));
	  radio.click();
	  
	  WebElement check=driver.findElement(By.xpath("//input[@value='ABS']"));
	  check.click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();
  }
  }


