package starter.n11seller.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SellerErrorElements {
    public static Target ERROR_MSG = Target.the("error message").locatedBy(".ui-message-error-detail");
}
