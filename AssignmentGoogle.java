package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class AssignmentGoogle {
	WebDriver driver;
  @Test
  public void gmail() throws InterruptedException {
	  WebElement gamil=driver.findElement(By.xpath("//a[text()='Gmail']"));
	  Thread.sleep(2000);
	  
	  
	  
	 String s=Keys.chord(Keys.CONTROL, Keys.ENTER);
	 gamil.sendKeys(s);
	 
	 Set<String> windowIds=driver.getWindowHandles();
	  
	  List<String> twoWindowIds= new ArrayList(windowIds);
	  String ParentWindowId= twoWindowIds.get(0);
	  String childWindowId= twoWindowIds.get(1);
	  
	  driver.switchTo().window(childWindowId);
	 
	WebElement sign=driver.findElement(By.xpath("//a[text()='Sign in']"));
	
	 sign.click();
	 driver.switchTo().window(ParentWindowId);
	 
	 WebElement google=driver.findElement(By.name("q"));
	 google.sendKeys("Selenium is Easy");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
