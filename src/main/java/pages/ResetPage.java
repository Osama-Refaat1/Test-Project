package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPage {

    WebDriver driver;
    public ResetPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Forgot password?")
    public WebElement forgotPasswordLink;

    @FindBy(id = "Email")
    public WebElement emailField;

    @FindBy(className = "content")
    public WebElement message;




    public void goToForgotPasswordPage() {
        forgotPasswordLink.sendKeys(Keys.ENTER);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickRecoveryButton() {
        emailField.sendKeys(Keys.ENTER);
    }

    public String getContentText() {
        return message.getText();
    }


}
