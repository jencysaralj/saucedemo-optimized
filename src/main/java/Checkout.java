import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Checkout {
    private static WebDriver driver;
    @FindBy(id="checkout")
    private WebElement checkoutButton;

    @FindBy(id="first-name")
    private WebElement firstName;

    @FindBy(id="last-name")
    private WebElement lastName;

    @FindBy(id="postal-code")
    private WebElement postalCode;

    @FindBy(id="continue")
    private WebElement continueButton;

    @FindBy(id="finish")
    private WebElement finishButton;

    @FindBy(className = "complete-header")
    private WebElement successfulOrderMessage;

    public Checkout(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickCheckOut(){
        checkoutButton.click();
    }

    public String assertOrder(){
        return successfulOrderMessage.getText();
    }

    public void enterDetails(String fName,String lName,String zip){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        postalCode.sendKeys(zip);
        continueButton.click();
        finishButton.click();
    }
}
