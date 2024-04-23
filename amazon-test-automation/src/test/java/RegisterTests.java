import Base.BaseLib;
import Base.BaseTest;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;


public class RegisterTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();


    @Test
    public void userCreate(){
        homePage.toLoginPage();

        registerPage
                .clickCreate()
                .fillNameSurname("QA TEST")
                .fillUsername(username)
                .fillPassword(password)
                .fillPasswordConfirm(password)
                .clickCheckbox()
                .clickRegister();
    }

    @Test
    public void notValidUser(){
        homePage.toLoginPage();

        registerPage
                .clickCreate()
                .fillNameSurname("QA TEST")
                .fillUsername(username)
                .fillPassword(password)
                .fillPasswordConfirm(password)
                .clickCheckbox()
                .clickRegister();
    }










}