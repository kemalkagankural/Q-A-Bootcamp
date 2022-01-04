package steps;

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
import ui.HomePageElements;

public class PaymentClientSteps {

    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="hhag";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("User login with user valid credentails")
    public void user_login_with_user_valid_credentails() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("company","company"));
    }
    @When("I click make payment button for deposit")
    public void ı_click_make_payment_button_for_deposit() {
        actor.attemptsTo(Payment.login());
    }
    @When("User make a deposit entering payment details")
    public void user_make_a_deposit_entering_payment_details() {

    }
    @Then("User should check to balance")
    public void user_should_check_to_balance() {

    }

}
