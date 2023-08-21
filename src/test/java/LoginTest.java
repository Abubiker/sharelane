import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    // 1.открыть браузер на https://www.sharelane.com/cgi-bin/register.py
    //2.ввести zipcode
    //3.нажать на кнопку продолжить
    //4.нажать на кнопку регистрация
    //5.проверить сообщение

    @Test
    public void verifyRegistrationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.xpath("//input[@name='zip_code']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        String errorMessage = driver.findElement(By.xpath("//span[@class='error_message']")).getText();
        Assert.assertEquals(errorMessage, "Oops, error on page. Some of your fields have invalid data or email was previously used");

    }
}
