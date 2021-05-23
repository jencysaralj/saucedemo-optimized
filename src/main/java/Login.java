
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
        private WebDriver driver;
        @FindBy(id="user-name" )
            private WebElement userName;
        @FindBy(id="password")
                private WebElement password;
        @FindBy(id="login-button")
                private WebElement loginButton;

        @FindBy(css="#login_button_container > div > form > div.error-message-container.error > h3")
        private WebElement invalidMessage;



    public  Login(WebDriver driver){
            this.driver =driver;
            PageFactory.initElements(driver,this);
        }

    public void loginAs(String username,String passwd){
            userName.sendKeys(username);
            password.sendKeys(passwd);
            loginButton.click();
        }

    public String setInvalidMessage(){
            return invalidMessage.getText();
    }

}
