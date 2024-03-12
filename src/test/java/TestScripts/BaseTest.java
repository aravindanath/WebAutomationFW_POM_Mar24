package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest {


  protected   WebDriver  driver;

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser)  {

      if (browser.equalsIgnoreCase("chrome")) {
        driver = new ChromeDriver();
      }else{
        driver = new FirefoxDriver();
      }
      driver.manage().window().maximize();
      driver.get("https://naveenautomationlabs.com/opencart/");
  }

  //  @AfterClass
    public void tearDown() throws InterruptedException {
      Thread.sleep(3000);
      driver.quit();
  }
}
