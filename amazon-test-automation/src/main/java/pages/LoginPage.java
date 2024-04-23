package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static Base.BaseTest.driver;

public class LoginPage extends BaseTest {
    By txtEmail = By.name("email");
    By txtPassword = By.name("password");
    By btnContinue = By.xpath("//*[@id=\"continue\"]");

    By btnLogin = By.xpath("//*[@id=\"signInSubmit\"]");



    @Step("Email alani doldurulur: {text}")
    public LoginPage fillUsername(String text) {
        driver.findElement(txtEmail).sendKeys(text);
        return this;
    }

    @Step
    public LoginPage clickContinue(){
        driver.findElement(btnContinue).click();
        return this;
    }
    @Step("Sifre doldurulur: {text}")
    public LoginPage fillPassword(String text){
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }

    @Step("Login butonuna tiklanir")
    public LoginPage clickLogin(){
        driver.findElement(btnLogin).click();
        screenshot(driver);
        return this;
    }


}
