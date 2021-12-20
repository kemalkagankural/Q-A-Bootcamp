package starter.n11seller.navigation.signup;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.n11seller.navigation.signup.SignupAsUser;
import starter.n11seller.navigation.user_interface.n11SellerSignupPageElements;
import starter.n11seller.navigation.user_interface.n11SellerHomePageElemets;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignupAsUser implements Task {
    private final String email_text;
    private final String password_text;
    private final String username_text;
    private final String compname_text;

    @Step("{0} Signup with email '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11SellerHomePageElemets.LOGIN_LINK),
                WaitUntil.the(n11SellerSignupPageElements.USERNAME_FIELD,isClickable()).forNoMoreThan(10).seconds(),
                Click.on(n11SellerSignupPageElements.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(n11SellerSignupPageElements.USERNAME_FIELD),
                Click.on(n11SellerSignupPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11SellerSignupPageElements.PASSWORD_FIELD),
                Click.on(n11SellerSignupPageElements.REPASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11SellerSignupPageElements.REPASSWORD_FIELD),
                Click.on(n11SellerSignupPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11SellerSignupPageElements.EMAIL_FIELD),
                Click.on(n11SellerSignupPageElements.REEMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11SellerSignupPageElements.REEMAIL_FIELD),
                Click.on(n11SellerSignupPageElements.COMPNAME_FIELD),
                SendKeys.of(this.compname_text).into(n11SellerSignupPageElements.COMPNAME_FIELD),
                Click.on(n11SellerSignupPageElements.USERTYPE_BUTTON),
                Click.on(n11SellerSignupPageElements.ACCEPT_BOX),
                Click.on(n11SellerSignupPageElements.SIGNUP_BTN)
        );



    }
    public SignupAsUser(String username_text, String password_text,String email_text,String compname_text){
        this.username_text = username_text;
        this.password_text = password_text;
        this.email_text = email_text;
        this.compname_text = compname_text;

    }



    public static SignupAsUser signupThePage(String username_text, String password_text,String email_text,String compname_text) {
        return instrumented(SignupAsUser.class
                ,username_text,password_text,email_text,compname_text);
    }


}
