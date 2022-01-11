package appium.stepsdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import java.util.concurrent.TimeUnit;

public class ListFilmes extends BaseScreen {

    @AndroidFindBy(id = "home_omdb")
    private MobileElement home_screen;

    @AndroidFindBy(id = "search_title")
    private MobileElement type_name;

    @AndroidFindBy(id = "search")
    private MobileElement btn_search;

    @AndroidFindBy(id = "android:id/message")
    private MobileElement dialog_message;


    public boolean isHomeScreen() {
       return this.home_screen.isDisplayed();

    }

    public void type_name(String keyword) {
        this.type_name.sendKeys(keyword);
    }

    public void search() {
        this.btn_search.click();
    }

    public boolean isDialogMessageAppears(){
        waitForVisibilityOfMobileElement(this.dialog_message);
        return this.dialog_message.isDisplayed();
    }

    public String getDialogMessage(){
        return this.dialog_message.getText();
    }

}
