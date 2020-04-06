import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//As a user, i want to login as customer and look for different clothes
public class SelectingDress {

    public static WebElement women(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Women"));
        return element;
    }
    public static WebElement dresses(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Dresses"));
        return element;
    }

    public static WebElement selectDress(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Summer Dresses"));
        return element;
    }

    public static WebElement select(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//p[@id='add_to_cart']/button/span"));

        return element;
    }

}

