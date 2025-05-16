package stepDefinitions;
import io.cucumber.java.en.And;
import pages.ResetPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class ResetStepDefinition
{
    WebDriver driver = Hooks.driver;

   ResetPage resetPage;

    @Given("user goes to login page")
    public void user_goes_to_login_page() throws InterruptedException {
        resetPage = new ResetPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/login");
        Thread.sleep(2000);
        System.out.println("1");
    }


    @When("user click on forgetPassword")
    public void user_clicks_on_forget_password() throws InterruptedException {
        resetPage.goToForgotPasswordPage();
        Thread.sleep(2000);
        System.out.println("2");

    }

    @Then("user navigate to forget Page and enter his email")
    public void user_navigates_to_fp_page_and_enter_email(String email) throws InterruptedException {
        resetPage.enterEmail(email);
        Thread.sleep(2000);
        System.out.println("3");
    }

    @And("user click on Recovery Button")
    public void user_clicks_on_recovery_button() throws InterruptedException {
         resetPage.clickRecoveryButton();
        Thread.sleep(2000);
        System.out.println("4");
    }

    @And("password will be reset")
    public void pass_reset_success() {
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = resetPage.getContentText();
        assertTrue("Assertion failed.",actualResult.contains(expectedResult));
        System.out.println("5");

    }
    @Then(" Then user navigate to forget Page and enter his email")
    public void user_enter_invalid_email(String email) throws InterruptedException {
        resetPage.enterEmail(email);
        Thread.sleep(2000);
        resetPage.clickRecoveryButton();
        System.out.println("6");
    }

    @Then("password will not be reset")
    public void pass_reset_fail() {
        String expectedResult = "Email not found.";
        String actualResult = resetPage.getContentText();
        assertTrue("Assertion failed.", actualResult.contains(expectedResult));
        System.out.println("7");
    }


}
