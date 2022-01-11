package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.LoginToEriBank;
import tasks.Payment;

public class PaymentSteps {
    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="kemal";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("user login")
    public void user_login() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("company","company"));
    }
//    @And("user make deposit via {phone} {name} {amount} {client}")
//    public void user_make_deposit_via_phone_number_amount_client(String phone,String name,String amount,String client) {
//        actor.attemptsTo(Payment.type(phone,name,amount,client));
//    }
    @Then("user should check")
    public void user_should_check() {

    }

    @And("user make deposit via {string} {string} {string} {string}")
    public void userMakeDepositVia(String phone, String name, String amount, String client) {
        actor.attemptsTo(Payment.type(phone,name,amount,client));
    }
}
