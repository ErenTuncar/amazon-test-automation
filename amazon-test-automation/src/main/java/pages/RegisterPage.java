package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    By btnCreate = By.xpath("//*[@id=\"createAccountSubmit\"]");
    By txtNameSurname = By.xpath("//*[@id=\"ap_customer_name\"]");
    By txtUsername = By.name("email");
    By txtPassword = By.name("password");
    By txtConfirmPassword = By.name("passwordCheck");
    By btnRegister = By.xpath("//*[@id=\"continue\"]");
    By btnCheckbox = By.xpath("//*[@id=\"ap_register_form\"]/div/div/div[4]/div/label/input");


    @Step
    public RegisterPage clickCreate(){
        driver.findElement(btnCreate).click();
        return this;

    }
    @Step
    public RegisterPage fillNameSurname(String text){
        driver.findElement(txtNameSurname).sendKeys(text);
        return this;
    }

    @Step
    public RegisterPage fillUsername(String text){
        driver.findElement(txtUsername).sendKeys(text);
        return this;
    }

    @Step
    public RegisterPage fillPassword(String text){
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }

    @Step
    public RegisterPage fillPasswordConfirm(String text){
        driver.findElement(txtConfirmPassword).sendKeys(text);
        return this;
    }

    @Step
    public RegisterPage clickCheckbox(){
        driver.findElement(btnCheckbox).click();
        return this;
    }

    @Step
    public RegisterPage clickRegister(){
        driver.findElement(btnRegister).click();
        return this;

    }

}
