package Base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BaseLib extends Data{
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);}

    public int createRandomNumber(int length){
        Random random = new Random();
        return random.nextInt(length);

    }
}
