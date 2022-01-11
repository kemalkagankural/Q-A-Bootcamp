package appium.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public enum AndroidDevicesCapabilities {


    ANDROID_OREO("src/test/resources/capabilities/android-oreo.json");


    private String path;

    AndroidDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getAndroidCapabilitiesFromPlataform() {
        DesiredCapabilities androidCapabilities = Load_capabilities.pathToDesiredCapabilitites(this.path);
        androidCapabilities.setCapability("app", new File("src/test/resources/apps/app-debug.apk").getAbsolutePath());
        return androidCapabilities;
    }

    public static void showAvaliableAndroidDevices() {
        System.out.println("======= ANDROID DEVICES ====== ");
        for (AndroidDevicesCapabilities androidDevicesCapabilities : AndroidDevicesCapabilities.values()) {
            System.out.println(androidDevicesCapabilities.name());
        }
    }
}
