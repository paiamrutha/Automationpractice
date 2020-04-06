import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//As a user, i want to login as customer and search for clothes by list and look for different color cloth.
public class SelectingTShirtcolor {

    public static WebElement women(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Women"));
        return element;
    }
    public static WebElement Tops(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Tops"));
        return element;
    }

    public static WebElement blouses(WebDriver browser){
        WebElement element = browser.findElement(By.linkText("Blouses"));
        return element;
    }

    public static WebElement more(WebDriver browser){
        WebElement element = browser.findElement(By.xpath("//span[contains(text(),'More')]"));
        return element;
    }

    public static WebElement Color(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//a[@id='color_8']"));
        return element;
    }

}
