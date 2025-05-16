package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;


public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(id = "Email")
   public WebElement emailInputField;

    @FindBy(id = "Password")
    public WebElement passwordInputField;

    public void applyLoginSteps(String email, String password)
    {
        emailInputField.clear();
        emailInputField.sendKeys(email);
        passwordInputField.sendKeys(password);


    }
}
