import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();


    @Test
    public void FailUserTest(){
        homePage.toLoginPage();

        loginPage
                .fillUsername(username)
                .clickContinue();
        mainPage.errorMessageControl(errorMessage1);
    }

    @Test
    public void FailPasswordTEST(){
        homePage.toLoginPage();

        loginPage
                .fillUsername("erentuncar_4@hotmail.com")
                .clickContinue()
                .fillPassword("87979")
                .clickLogin();

        mainPage.errorMessageControl2(errorMessage2);
    }

    @Test
    public void NoneDataTEST(){
        homePage.toLoginPage();


        loginPage
                .fillUsername("")
                .clickContinue();

        mainPage.errorMessageControl3(errorMessage3);
    }

    @Test
    public void MinimumCharTESTno(){
        homePage.toLoginPage();

        loginPage
                .fillUsername("1")
                .clickContinue();
        mainPage.errorMessageControl4(errorMessage4);
    }

    @Test
    public void MaximumCharTESTno(){
        homePage.toLoginPage();

        loginPage
                .fillUsername("113242134141124124141414141414141414214124141412")
                .clickContinue();
        mainPage.errorMessageControl4(errorMessage4);
    }

    @Test
    public void MinimumCharTEST(){
        homePage.toLoginPage();

        loginPage
                .fillUsername("a")
                .clickContinue();
        mainPage.errorMessageControl(errorMessage1);
    }

    @Test
    public void MaximumCharTEST(){
        homePage.toLoginPage();

        loginPage
                .fillUsername("asahjbfahjfbahjbfjashbfhjasfbhjafbshafkafkahfkafhfkaskjafkjafnkanfkafnkaf")
                .clickContinue();
        mainPage.errorMessageControl5(errorMessage1);
    }


    @Test
    public void SuccessTEST(){
        homePage.toLoginPage();

        loginPage
                .fillUsername(username)
                .clickContinue()
                .fillPassword(password)
                .clickLogin();

        homePage.pageControl();


    }



}
