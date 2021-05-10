import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Labact1 {



        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "H:\\Applen\\webdriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys("Software Testing");
            search.submit();




        }
}
