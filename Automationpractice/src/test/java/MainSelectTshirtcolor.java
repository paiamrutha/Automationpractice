import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainSelectTshirtcolor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        SignIn.LogIn(driver).click();
        SignIn.username(driver).sendKeys("amrutha.iths@iths.se");
        SignIn.password(driver).sendKeys("iths2020");
        SignIn.signIn(driver).click();
        SelectingTShirtcolor.women(driver).click();
        SelectingTShirtcolor.Tops(driver).click();
        SelectingTShirtcolor.blouses(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        SelectingTShirtcolor.more(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        SelectingTShirtcolor.Color(driver).click();
        driver.quit();
    }
}
