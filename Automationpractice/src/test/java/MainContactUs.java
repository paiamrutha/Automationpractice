import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainContactUs {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.out.println("Contact Us");
        driver.get("http://automationpractice.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ContactUs.contactUs1(driver).click();
        ContactUs.subHeading(driver).click();
        ContactUs.subHeading1(driver).click();
        ContactUs.emailId(driver).sendKeys("iths@iths.se");
        ContactUs.order(driver).sendKeys("Order243");
        ContactUs.message(driver).sendKeys("Hi , Refund required for Order234");
        ContactUs.send(driver).click();
    }
}
