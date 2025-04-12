package testcase;

import base.BaseClass;
import org.testng.annotations.Test;
import page.Login;

public class LoginTest extends BaseClass {

    @Test
    public void Loggin() {
        Login log = new Login(driver);
        log.signin(prop.getProperty("name"), prop.getProperty("pwd"));
        log.click();
        System.out.println("Now trying gitbash");
    }
}
