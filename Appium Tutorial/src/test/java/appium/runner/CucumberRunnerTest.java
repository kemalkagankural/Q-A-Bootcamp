package appium.runner;

import appium.capabilities.AndroidDevicesCapabilities;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = "src/test/resources/features",
        glue = "appium.stepsdefinitions",
        //tags ="@appium",
       // tags="@capability",
        tags ="@favoritos",
        plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm", "pretty"})

public class CucumberRunnerTest {

    private static AppiumDriver<?> Driver;
    private static AppiumDriverLocalService service;
    @BeforeClass
    public static void tearUp() throws MalformedURLException {
        Driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),
                AndroidDevicesCapabilities.valueOf("ANDROID_OREO").getAndroidCapabilitiesFromPlataform());

    }

    @AfterClass
    public static void tearDown() {
      quitDriver();
    }

    public static void quitDriver() {
        if (Driver != null) {
            Driver.quit();
        }
    }
    public static AppiumDriver<?> getDriver() {
        return Driver;
    }

    public static void reLaunchApp() {
        if (Driver != null) {
            Driver.launchApp();
        }
    }

}
