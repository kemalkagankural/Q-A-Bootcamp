package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import ui.LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginToEriBank implements Task {
    private String username="";
    private String password="";

    public LoginToEriBank(String username, String password) {

        this.username = username;
        this.password = password;
    }


    @Override
    @Step("{0} logins to the eribank")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPageElements.USERNAME_FIELD),
                SendKeys.of(this.username).into(LoginPageElements.USERNAME_FIELD),
                Click.on(LoginPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password).into(LoginPageElements.PASSWORD_FIELD),
                Click.on(LoginPageElements.LOGIN_BTN)
        );
    }

    public static LoginToEriBank login(String username, String password){
        return instrumented(LoginToEriBank.class, username,password);
    }


}
