import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSearch {
    //White Fang
    @Test
    public void testSearch() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--remote-allow-origins");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//input[@name='keyword']")).sendKeys("White Fang");
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.xpath("//img[@border='0']")).click();

    }
}
