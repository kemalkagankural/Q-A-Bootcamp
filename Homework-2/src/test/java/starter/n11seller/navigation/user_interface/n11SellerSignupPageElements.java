package starter.n11seller.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SellerSignupPageElements {
    public static Target USERNAME_FIELD = Target.the("username textbox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("password textbox").located(By.id("passwordInputText"));
    public static Target REPASSWORD_FIELD = Target.the("repassword textbox").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("emailInputText"));
    public static Target REEMAIL_FIELD = Target.the("reemail textbox").located(By.id("emailRetypeInputText"));
    public static Target COMPNAME_FIELD = Target.the("compname textbox").located(By.id("nicknameInputText"));
    public static Target USERTYPE_BUTTON = Target.the("Usertype Button").locatedBy("//label[contains(text(),'Şahıs')]");
    public static Target ACCEPT_BOX = Target.the("accept term box").located(By.id("acceptTermsAndConditions"));
    public static Target SIGNUP_BTN = Target.the("signup btn").locatedBy("//div[@id='j_id274_j_id_dj']");
}