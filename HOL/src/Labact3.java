import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Labact3 {
    public static void main(String []args) {
        System.setProperty("webdriver.chrome.driver", "H:\\Applen\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.adlibris.com/se");
        driver.manage().window().maximize();
        driver.findElement(By.id("q")).click();
        driver.findElement(By.id("q")).sendKeys("praktisk mjukvarutestning");
        driver.findElement(By.id("q")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".purchase__wrapper .currency")).click();
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/header/button[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement caas = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Till kassan")));

        caas.click();

    }
}
