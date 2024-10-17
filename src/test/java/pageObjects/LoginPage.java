package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("login_field");
    private By passwordField = By.id("password");
    private By signInButton = By.name("commit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signInButton).click();
    }
}


