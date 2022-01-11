package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageElements {


    public static Target USERNAME_FIELD = Target.the("USERNAME field")
            .located(By.id("usernameTextField"));

    public static Target PASSWORD_FIELD = Target.the("USERNAME field")
            .located(By.id("passwordTextField"));
    public static Target LOGIN_BTN = Target.the("USERNAME field")
            .located(By.id("loginButton"));


}
