package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import ui.ClientElements;
import ui.HomePageElements;
import ui.PaymentPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Payment implements Task {

    private String phone="";
    private String name ="";
    private String amount ="";
    private String client ="";

    public Payment(String phone,String name,String amount,String client) {
        this.phone = phone;
        this.name = name;
        this.amount = amount;
        this.client = client;

    }
    public Target COUNTRY_ELEMENT = Target.the("Country Element")
            .located(By.xpath("//android.widget.TextView[@text='"+client+"']"));


    @Override
    @Step("{0} deposite to the eribank")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.PAYMENT_BTN),
                //WaitUntil.the(HomePageElements.PAYMENT_BTN,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(PaymentPageElements.PHONE_FIELD),
                SendKeys.of(this.phone).into(PaymentPageElements.PHONE_FIELD),
                Click.on(PaymentPageElements.NAME_FIELD),
                SendKeys.of(this.name).into(PaymentPageElements.NAME_FIELD),
                SendKeys.of(this.amount).into(PaymentPageElements.AMOUNT_SCROLL),
                Click.on(PaymentPageElements.COUNTRY_BUTTON),
                Click.on(COUNTRY_ELEMENT)

//                Scroll.to(ClientElements.CLIENT_LIST).andAlignToTop()


        );
    }



    public static  Payment type(String phone, String name, String amount, String client){
        return  instrumented(Payment.class,phone,name,amount,client);
    }

}
