package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11seller.navigation.signup.SignupAsUser;
import starter.n11seller.navigation.tasks.NavigateTo;
import starter.n11seller.navigation.user_interface.n11SellerErrorElements;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class n11SignupSellerStepsDefinitions {
    Actor actor = Actor.named("kemal");

    @Managed
    WebDriver webDriver;
    @Given("user launch browser and open the login page")

    public void userLaunchBrowserAndOpenTheLoginPage() {
        actor.can(BrowseTheWeb.with(webDriver));
       actor.wasAbleTo(NavigateTo.theN11SellerHomePage());
    }

    @When("user signed in selleroffice with valid credentials")
    public void userSignedInSellerofficeWithValidCredentials() {
        actor.attemptsTo(SignupAsUser.signupThePage("kemalkural","123","test@gmail.com","kural"));
    }

    @Then("user signed in selleroffice successfully")
    public void userSignedInSellerofficeSuccessfully() {
    }
}
