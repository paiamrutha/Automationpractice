import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// As a user, i want to login as customer and process the payment when the product is already in cart.
public class Payment {

    public static WebElement payByBankWire(WebDriver browser){
        WebElement element = browser.findElement(By.xpath(" //a[@class='bankwire']"));
        return element;
    }
    public static WebElement confirm(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));
        return element;
    }

    public static void Shipping(WebDriver browser){
        String actualShippingCost = browser.findElement(By.xpath("//td[@id='total_shipping']")).getText();
        Assert.assertEquals("$2.00",actualShippingCost);
    }
}
