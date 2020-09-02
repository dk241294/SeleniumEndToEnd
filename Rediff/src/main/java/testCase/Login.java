package testCase;


import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        LoginPage r = new LoginPage(driver);
        r.emailID().sendKeys("deepak");
        Thread.sleep(2000);
        r.password().sendKeys("kumar");
        r.signin().click();
        Thread.sleep(2000);
        r.homePage().click();
    }
}
