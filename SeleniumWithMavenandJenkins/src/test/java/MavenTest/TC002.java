package MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TC002 {
	@Test
	public void TC002() throws InterruptedException
	{ 
	 System.setProperty("webdriver.gecko.driver",".\\Executable\\geckodriver.exe");

     DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	
        WebDriver driver=new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/secure");
       
        
        WebElement usernametxt= driver.findElement(By.id("username"));
        WebElement passwordtxt= driver.findElement(By.id("password"));
        WebElement loginbtn= driver.findElement(By.xpath(".//*[@id='login']/button"));

        //valid username and password   
        usernametxt.sendKeys("tomsmith");
           passwordtxt.sendKeys("SuperSecretPassword!"); 
           loginbtn.click(); 
     
 		     Thread.sleep(3);
            String Actual=driver.getCurrentUrl();
           String Expected="https://the-internet.herokuapp.com/securedoaa"; 
           
	}
}
