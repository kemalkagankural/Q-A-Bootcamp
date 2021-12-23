package starter.n11login.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11LoginPageElements {
    public static Target EMAIL_AREA = Target.the("email area").located(By.id("email"));
    public static Target PASSWORD_AREA = Target.the("password area").located(By.id("pass"));
    public static Target LOGIN_BTN = Target.the("login btn").located(By.id("loginbutton"));
}
