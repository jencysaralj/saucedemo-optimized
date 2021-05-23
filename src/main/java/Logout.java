import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
    private WebDriver driver;

    @FindBy(id="react-burger-menu-btn")
    private WebElement sideBar;
    @FindBy(id="logout_sidebar_link")
    private WebElement logoutButton;

    public  Logout(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void logout(){
        sideBar.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
    }
}
