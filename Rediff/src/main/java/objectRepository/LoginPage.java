package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    By userName = By.name("login");
    By passWord = By.xpath("//input[@name='passwd']");
    By signIn = By.name("proceed");
    By rediffHomePage = By.linkText("rediff.com");

    public WebElement emailID() {
        return driver.findElement(userName);
    }

    public WebElement password() {
        return driver.findElement(passWord);
    }

    public WebElement signin() {
        return driver.findElement(signIn);
    }

    public WebElement homePage() {
        return driver.findElement(rediffHomePage);
    }
}