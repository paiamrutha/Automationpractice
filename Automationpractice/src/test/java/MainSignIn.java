import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSignIn {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        SignIn.LogIn(driver).click();
        SignIn.username(driver).sendKeys("amrutha.iths@iths.se");
        SignIn.password(driver).sendKeys("iths2020");
        SignIn.signIn(driver).click();
    }
}
