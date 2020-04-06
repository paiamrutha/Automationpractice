import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

    public class Checkout {

        public static WebElement addCart(WebDriver browser){
            WebElement element = browser.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
            return element;
        }
        public static WebElement proceedCheckOut1(WebDriver browser) {
            WebElement element1 = browser.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
            browser.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            return element1;
        }

        public static WebElement proceedCheckOut2(WebDriver browser){
            WebElement element = browser.findElement(
                    By.xpath("//text()[.='Proceed to checkout']/ancestor::span[1]"));
            return element;
        }

        public static WebElement proceedCheckOut3(WebDriver browser){
            WebElement element = browser.findElement(By.xpath("//text()[.='Proceed to checkout']/ancestor::span[1]"));
            return element;
        }
        public static WebElement proceedCheckOut4(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"));
            return element;
        }

        public static WebElement termsAndCondition(WebDriver browser){
            WebElement element = browser.findElement(By.xpath("//input[@id='cgv']"));
            return element;
        }

    }


