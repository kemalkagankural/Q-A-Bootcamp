package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import tasks.Payment;


public class ClientPageElements {



    public static Target COUNTRY_ELEMENT = Target.the("Country Element")
            .located(By.xpath("//android.widget.TextView[@text='"+Client()+"']"));

    private static Payment Client() {
        return Payment.select("client");
    }
}
