package starter.n11login.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.n11login.user_interface.n11HomePageElements;
import starter.n11login.user_interface.n11LoginPageElements;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginAsUser implements Task {
    private final String email_text;
    private final String password_text;

    @Step("{0} Login with email '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11HomePageElements.LOGIN_LINK),
                Click.on(n11HomePageElements.FACEBOOK_LINK),
                Switch.toTheOtherWindow(),
                WaitUntil.the(n11LoginPageElements.EMAIL_AREA,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(n11LoginPageElements.EMAIL_AREA),
                SendKeys.of(this.email_text).into(n11LoginPageElements.EMAIL_AREA),
                Click.on(n11LoginPageElements.PASSWORD_AREA),
                SendKeys.of(this.password_text).into(n11LoginPageElements.PASSWORD_AREA),
                Click.on(n11LoginPageElements.LOGIN_BTN),
                Switch.toNewWindow()

        );
    }
    public LoginAsUser(String email_text, String password_text){
        this.email_text = email_text;
        this.password_text = password_text;

    }
    public static LoginAsUser loginThePage(String email_text, String password_text) {
        return instrumented(LoginAsUser.class
                ,email_text,password_text);
    }
}
