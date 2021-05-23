import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    private static WebDriver driver;
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton;


    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCart;



    public AddToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addToCart(){
        addToCartButton.click();
        shoppingCart.click();
    }


}
