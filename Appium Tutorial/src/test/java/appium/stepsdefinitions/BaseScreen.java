package appium.stepsdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static appium.runner.CucumberRunnerTest.getDriver;

public abstract class BaseScreen extends MobileElement {


    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    protected void waitForInsvisibilityOfElement(By locator) {
        new WebDriverWait(getDriver(), 5)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForVisibilityOfElement(By locator) {

        new WebDriverWait(getDriver(), 5)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForVisibilityOfMobileElement(MobileElement element){
        new WebDriverWait(getDriver(), 5)
                .until(ExpectedConditions.visibilityOf(element));
    }





    public static void swipteFromRightToLeft(){
        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = getDriver().manage().window().getSize();
        int edgeBorder = 10; // better avoid edges

        pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);

        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        new TouchAction(getDriver())
                .press(pointOptionStart)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                .moveTo(pointOptionEnd)
                .release().perform();
    }
    public static void swipeFromLeftToRigth(){

        int edgeBorder = 10; // better avoid edges

        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = getDriver().manage().window().getSize();
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);

        new TouchAction(getDriver())
                .press(pointOptionStart)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                .moveTo(pointOptionEnd)
                .release().perform();
    }


}
