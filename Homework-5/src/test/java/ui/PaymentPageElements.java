package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPageElements {

    public static Target PHONE_FIELD = Target.the("Phone field")
            .located(By.id("phoneTextField"));
    public static Target NAME_FIELD = Target.the("Name field")
            .located(By.id("nameTextField"));
    public static Target AMOUNT_SCROLL = Target.the("Amount scroll")
            .located(By.id("amount"));
    public static Target COUNTRY_BUTTON = Target.the("Country Button")
            .located(By.id("countryButton"));
    public static Target PAYMENT_BUTTON = Target.the("Payment Button")
            .located(By.id("sendPaymentButton"));
    public static Target CONFIRM_BUTTON = Target.the("Confirm Button")
            .located(By.id("android:id/button1"));
}