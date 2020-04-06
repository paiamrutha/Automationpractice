import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

//As a user, i want to login as customer with the correct password

public class SignIn {
    public static WebElement LogIn(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//a[@class='login']"));
        browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return element;
    }
    public static WebElement username(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='email']"));
        return element;
    }
    public static WebElement password(WebDriver browser){
        WebElement element = browser.findElement(By.id("passwd"));
        return element;
    }
    public static WebElement signIn(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//p[@class='submit']//span[1]"));
        return element;
    }

}
