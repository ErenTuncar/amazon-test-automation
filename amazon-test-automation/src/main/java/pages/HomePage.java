package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    By btnToLogin = By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span");
    By txtSignOut = By.xpath("//*[@id=\"nav-item-signout\"]/span//*[@id=\"nav-item-signout\"]/span");


    @Step("Login ekranina gidilir")
    public HomePage toLoginPage(){
        driver.findElement(btnToLogin).click();
        return this;
    }

    @Step
    public HomePage pageControl(){
        driver.findElement(txtSignOut).getText();
        return this;
    }
}
