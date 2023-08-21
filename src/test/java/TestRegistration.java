import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestRegistration {

    private WebDriver driver;
    @Test
    public void testAuthorization() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--remote-allow-origins");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.xpath("//input[@name='zip_code']")).sendKeys("11223");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Andrey");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Andreev");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("andreyandreev@mail.com");
        driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("qwertyuiop");
        driver.findElement(By.xpath("//input[@name='password2']")).sendKeys("qwertyuiop");
        driver.findElement(By.xpath("//input[@value='Register']")).click();

    }
   
}
