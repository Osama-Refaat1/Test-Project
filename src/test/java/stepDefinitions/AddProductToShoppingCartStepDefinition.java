package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddProductToCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductToShoppingCartStepDefinition {

    WebDriver driver = Hooks.driver;;
        AddProductToCartPage addProductPage;

        @When("user click on the add to cart button")
        public void user_click_on_add_to_cart_button() throws InterruptedException {
            addProductPage = new AddProductToCartPage(driver);
            driver.get("https://demo.nopcommerce.com");
            Thread.sleep(3000);
        addProductPage.clickOnProductLink();
            Thread.sleep(3000);
        addProductPage.addToCart();
        }

        @When("confirm adding to shopping cart")
        public void go_to_cart() throws InterruptedException {
            addProductPage.goToShoppingCart();
            Thread.sleep(3000);
        }

        @Then("the product is added successfully to the shopping cart")
        public void confirm_product_added() throws InterruptedException
        {


            addProductPage = new AddProductToCartPage(driver);
            Thread.sleep(3000);
            addProductPage.clickOnProductLink();
            Thread.sleep(3000);
            addProductPage.addToCart();
            Thread.sleep(3000);

            // First Assertion
            String expectedResult = "The product has been added to your shopping cart";
            String actualResult = addProductPage.getProductName();

            Assert.assertTrue(actualResult.contains(expectedResult));


        }
    }

