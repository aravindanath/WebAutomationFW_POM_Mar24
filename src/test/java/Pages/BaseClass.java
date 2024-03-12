package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BaseClass {

   protected WebDriver driver;


   public BaseClass(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver,this);
   }



   public static String firstName(){
      Faker faker = new Faker();
      return faker.name().firstName();
   }

   public static String lastName(){
      Faker faker = new Faker();
      return faker.name().lastName();
   }


   public static String emailid(){
      Faker faker = new Faker();
      return faker.name().firstName()+"@testnail.com";
   }

   public static String mobileNumber(){
      Faker faker = new Faker();
      return faker.number().digits(10);
   }


   public static void waitForElement(long timeout){
      try{
         Thread.sleep(timeout);
      }catch (InterruptedException e){

      }
   }

   public static void verifyTitle(WebElement element, String text){
     String actual =  element.getText();
      Assert.assertEquals(actual, text);
   }




}
