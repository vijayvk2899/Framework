package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement name;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement pwd;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btn;

    public void signin(String uname, String upwd){
        name.sendKeys(uname);
        pwd.sendKeys(upwd);
    }

    public void click(){
        btn.click();
    }




}
