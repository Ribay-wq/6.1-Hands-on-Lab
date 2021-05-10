import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Labact2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "H:\\Applen\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actitime.com/");
        driver.manage().window().maximize();
        WebElement tryck = driver.findElement(By.linkText("Try Free"));
        tryck.click();

        driver.findElement(By.id("cookie-button--got-it"))
                .click();

        driver.findElement(By.id("first-name"))
                .click();
        driver.findElement(By.id("first-name"))
                .sendKeys("Lars");



        driver.findElement(By.id("last-name"))
                .sendKeys("Lindgren");


        driver.findElement(By.id("email"))
                .sendKeys("lars.lindgren@blizzard.net");


        driver.findElement(By.id("company"))
                .sendKeys("LTU");

    }
}
