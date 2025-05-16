package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductToCartPage {
    WebDriver driver;
    public AddProductToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(linkText = "HTC smartphone")
    public WebElement productLink;

    @FindBy(id = "add-to-cart-button-18")
    public WebElement addToCartButton;

    @FindBy(className = "ico-cart")
    public WebElement shoppingCartLink;

    @FindBy(className = "product-name")
    public WebElement productName;



    public void clickOnProductLink() {
        productLink.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void goToShoppingCart() {
        shoppingCartLink.click();
    }

    public String getProductName() {
        return productName.getText();
    }


}
