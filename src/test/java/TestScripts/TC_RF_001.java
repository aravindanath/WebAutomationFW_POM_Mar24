package TestScripts;

import Pages.BaseClass;
import Pages.Homepage;
import Pages.Registerpage;
import org.testng.annotations.Test;

public class TC_RF_001  extends  BaseTest{

    @Test
    public void TC_RF_001(){

        String firstName = BaseClass.firstName(),lastName = BaseClass.lastName()
                ,email = BaseClass.emailid(),mobile = BaseClass.mobileNumber(),
        password = "password@123";

        Homepage homepage = new Homepage(driver);
        homepage.navigateToRegisterpage();

        Registerpage rp = new Registerpage(driver);
        rp.validateRegisteringAnAccountWithMandatoryFields(firstName,lastName,email,mobile,password,password);
    }


}
