package pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {
    String errorMessage1 = "Bu e-posta adresiyle bir hesap bulamıyoruz";
    String errorMessage2 = "Şifreniz yanlış";
    String errorMessage3 = "E-posta adresinizi veya cep telefonu numaranızı girin";
    String errorMessage4 = "Yanlış telefon numarası";





    @Step("Hata mesaji goruntulenir: {errorMessage}")
    public MainPage errorMessageControl(String errorMessage){
        String text = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText();
        Assert.assertEquals(text, errorMessage);
        return this;
    }

    @Step("Hata mesaji goruntulenir: {errorMessage}")
    public MainPage errorMessageControl2(String errorMessage){

        String text = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText();
        Assert.assertEquals(text, errorMessage);
        return this;
    }

    public MainPage errorMessageControl3(String errorMessage){

        String text = driver.findElement(By.xpath("//*[@id=\"auth-email-missing-alert\"]/div/div")).getText();
        Assert.assertEquals(text, errorMessage);
        return this;
    }

    public MainPage errorMessageControl4(String errorMessage){

        String text = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText();
        Assert.assertEquals(text, errorMessage);
        return this;
    }

    public MainPage errorMessageControl5(String errorMessage){

        String text = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText();
        Assert.assertEquals(text, errorMessage);
        return this;
    }

}