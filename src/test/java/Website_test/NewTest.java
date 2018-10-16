package Website_test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
//import org.testng.Assert;

public class NewTest {
	WebDriver driver;
  @Test
  public void verifyuser() throws InterruptedException {
		//String x = driver.getTitle();
		//System.out.println(x);
	    //Thread.sleep(5000);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("login")).sendKeys("edureka");
		driver.findElement(By.name("password")).sendKeys("edureka");
		driver.findElement(By.name("click")).click();
		//driver.findElement(By.xpath("//div[@]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	
	  System.setProperty("webdriver.gecko.driver","geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.127:3001/");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }

}
