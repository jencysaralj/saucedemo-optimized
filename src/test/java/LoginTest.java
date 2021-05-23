import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    public WebDriver driver;


    @Test
    public void validLoginAndLogoutIntoSauceDemo() {
        String chromeDriverPath = System.getProperty("user.dir")+"/chromedriver";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Login login = new Login(driver);
        login.loginAs("standard_user","secret_sauce");
        Logout logout = new Logout(driver);
        logout.logout();
        driver.quit();
   }
   @Test
   public void invalidLogin(){
       String chromeDriverPath = System.getProperty("user.dir")+"/chromedriver";
       System.setProperty("webdriver.chrome.driver",chromeDriverPath);
       driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
       Login login = new Login(driver);
       login.loginAs("performance","secret_sauce");
       Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",login.setInvalidMessage());
       driver.quit();
   }

   @Test
    public void selectProduct(){
       String chromeDriverPath = System.getProperty("user.dir")+"/chromedriver";
       System.setProperty("webdriver.chrome.driver",chromeDriverPath);
       driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
       Login login = new Login(driver);
       login.loginAs("standard_user","secret_sauce");
       SelectProduct select = new SelectProduct(driver);
       select.selectItem();
       driver.quit();
   }
   @Test
    public void addToCart(){
       String chromeDriverPath = System.getProperty("user.dir")+"/chromedriver";
       System.setProperty("webdriver.chrome.driver",chromeDriverPath);
       driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
       Login login = new Login(driver);
       login.loginAs("standard_user","secret_sauce");
       AddToCart addToCart = new AddToCart(driver);
       addToCart.addToCart();
       driver.quit();
   }

   @Test
    public void checkOut(){
       String chromeDriverPath = System.getProperty("user.dir")+"/chromedriver";
       System.setProperty("webdriver.chrome.driver",chromeDriverPath);
       driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com/");
       Login login = new Login(driver);
       login.loginAs("standard_user","secret_sauce");
       AddToCart addToCart = new AddToCart(driver);
       addToCart.addToCart();
       Checkout checkout = new Checkout(driver);
       checkout.clickCheckOut();
       checkout.enterDetails("George","Bush","1234");
       Assert.assertEquals(checkout.assertOrder(),"THANK YOU FOR YOUR ORDER");
       driver.quit();
   }




}
