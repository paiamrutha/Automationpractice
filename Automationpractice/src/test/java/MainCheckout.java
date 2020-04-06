import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainCheckout {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        SignIn.LogIn(driver).click();
        SignIn.username(driver).sendKeys("amrutha.iths@iths.se");
        SignIn.password(driver).sendKeys("iths2020");
        SignIn.signIn(driver).click();
        Checkout.addCart(driver).click();
        Checkout.proceedCheckOut1(driver).click();
        Checkout.proceedCheckOut2(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        Checkout.proceedCheckOut3(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        Checkout.termsAndCondition(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        Checkout.proceedCheckOut4(driver).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.quit();
    }
}