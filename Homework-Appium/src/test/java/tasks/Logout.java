package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import ui.HomePageElements;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logout implements Task {
    @Override
    @Step("{0} deposite to the eribank")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.LOGOUT_BTN)
        );
    }
    public static  Logout logout(){
        return  instrumented(Logout.class);
    }


}



