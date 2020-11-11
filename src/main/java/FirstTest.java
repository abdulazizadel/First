import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

    }
}
