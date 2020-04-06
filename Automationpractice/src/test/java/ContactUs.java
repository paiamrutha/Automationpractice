import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//As a user, i dont want to login as customer but still be able to contact the services with input details and send a message to customer service.
public class ContactUs {
    public static WebElement contactUs1(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//div[@id='contact-link']//a[contains(text(),'Contact us')]"));
        return element;
    }

    public static WebElement subHeading(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//select[@id='id_contact']"));
        return element;
    }
    public static WebElement subHeading1(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//option[@value='2']"));
        return element;
    }
    public static WebElement order(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@id='id_order']"));
        return element;
    }
    public static WebElement message(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//textarea[@id='message']"));
        return element;
    }
    public static WebElement send(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'Send')]"));
        return element;
    }
    public static WebElement emailId(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//input[@id='email']"));
        return element;
    }

}
