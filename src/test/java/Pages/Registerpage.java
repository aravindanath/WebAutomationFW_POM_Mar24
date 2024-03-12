package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends BaseClass{

    public Registerpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    WebElement firstNameTextBox;

    @FindBy(id = "input-lastname")
    WebElement lastNameTextBox;

    @FindBy(id = "input-email")
    WebElement emailTextBox;

    @FindBy(id = "input-telephone")
    WebElement phoneTextBox;

    @FindBy(id = "input-password")
    WebElement passwordTextBox;

    @FindBy(id = "input-confirm")
    WebElement confirmPasswordTextBox;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkBox;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;


    // Business Logic

    public void validateRegisteringAnAccountWithMandatoryFields(String firstName, String lastName, String email,String phoneNumber, String password,String confirmPassword){
        firstNameTextBox.sendKeys(firstName);
        lastNameTextBox.sendKeys(lastName);
        emailTextBox.sendKeys(email);
        phoneTextBox.sendKeys(phoneNumber);
        passwordTextBox.sendKeys(password);
        confirmPasswordTextBox.sendKeys(confirmPassword);
        checkBox.click();
        waitForElement(3000);
        continueButton.click();
        waitForElement(3000);
    }


    public void validateRegisteredEmailAddress(){

    }
}
