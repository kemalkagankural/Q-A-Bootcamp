package starter.n11login.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class n11HomePageElements {
    public static Target LOGIN_LINK = Target.the("login link").locatedBy(".btnSignIn");
    public static Target FACEBOOK_LINK = Target.the("Facebook link").locatedBy(".facebookBtn");
}
