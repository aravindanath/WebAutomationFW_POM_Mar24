package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass{

    public Homepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountButton;

    @FindBy(xpath = "//span[contains(text(),'Wish List')]")
    WebElement wishList;

    @FindBy(linkText = "Register")
    WebElement registerButton;

    @FindBy(linkText = "Login")
    WebElement loginButton;


    public void navigateToRegisterpage(){
        myAccountButton.click();
        waitForElement(2000);
        registerButton.click();
    }


}
