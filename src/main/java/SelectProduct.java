import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
    private WebDriver driver;
    @FindBy(css = "#item_4_title_link > div")
    private  WebElement select;

    public SelectProduct(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void selectItem(){
        select.click();
    }
}
