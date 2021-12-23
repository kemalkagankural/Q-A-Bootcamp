package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11login.login.LoginAsUser;
import starter.n11login.tasks.NavigateTo;
import starter.n11login.user_interface.n11UserHomePageElements;

public class N11LoginStepsDefinitions {

    Actor actor = Actor.named("kemal");

    @Managed
    WebDriver webDriver;


    @Given("user launch browser and open the main page")
    public void userLaunchBrowserAndOpenTheMainPage() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11HomePage());
    }

    @When("user logged in with Facebook")
    public void userLoggedInWithFacebook() {
        actor.attemptsTo(LoginAsUser.loginThePage("kuralkagan97@gmail.com","kemal1997"));
    }

    @Then("user logged in successfully")
    public void userLoggedInSuccessfully() {
        actor.attemptsTo(
                Ensure.that(n11UserHomePageElements.USERNAME_LINK).isDisplayed(),
                Ensure.that(n11UserHomePageElements.USERNAME_LINK).hasText("Tester")

        );
    }
}
