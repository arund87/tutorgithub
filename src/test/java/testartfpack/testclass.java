package testartfpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testclass {
     
	WebDriver driver;
        @Test
	public void wordpressrun() {
	
      driver =new FirefoxDriver();
      driver.get("https://wordpress.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
      driver.quit();
	}

}
