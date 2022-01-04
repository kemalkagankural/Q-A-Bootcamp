package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import ui.HomePageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Payment implements Task {
    private String username="";
    private String password="";

    public Payment() {


    }


    @Override
    @Step("{0} deposite to the eribank")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.PAYMENT_BTN)

        );
    }

    public static Payment login(){
        return instrumented(Payment.class);
    }


}
