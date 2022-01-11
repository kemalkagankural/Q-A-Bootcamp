package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClientElements {
    public static Target CLIENT_LIST = Target.the("Client List").located(By.id("com.experitest.ExperiBank:id/countryList"));
    public static Target USA_ELEMENT = Target.the("Usa Element").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[2]"));
}
