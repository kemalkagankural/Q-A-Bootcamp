package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import screenplay.api_interface.SearchAPI;
import screenplay.questions.CurrentSearchResultCount;
import screenplay.tasks.LookForProductItem;
import screenplay.tasks.NavigateTo;

import java.util.List;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class SearchStepDefinitions {


    @Steps
    SearchAPI searchAPI;

    Actor actor = Actor.named("onurcanyondem");
    @Managed
    WebDriver theBrowser;

    @Given("I open browser and go to the main page")
    public void iOpenBrowserAndGoToTheMainPage() {
        actor.can(BrowseTheWeb.with(theBrowser));
        actor.wasAbleTo(NavigateTo.theAutomationPracticeHomePage());
    }

    @When("I search with {string} in the home page")
    public void iSearchWithInTheHomePage(String term) {
        term = "kaan";
        actor.attemptsTo(LookForProductItem.about(term));
        /*try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */
    }

    @Then("api endpoint should be called with {string}")
    public void apiEndpointShouldBeCalledWith(String term) {
        actor.whoCan(CallAnApi.at(searchAPI.invoke_my_webservice()));
        actor.attemptsTo(
                Get.resource("index.php?controller=search&q=test&limit=10&timestamp=1639907643890&ajaxSearch=1&id_lang=1")
        );

        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */
    }

    @When("api returned related results")
    public void apiReturnedRelatedResults() {
        actor.should(
                seeThatResponse("related results should be retrieved",
                        response -> response.statusCode(200))
        );
        /*
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    @Then("I should see related results on the main page")
    public void iShouldSeeRelatedResultsOnTheMainPage() {

        System.out.println("last response: "+SerenityRest.lastResponse().statusCode());
        List<String> resultList = SerenityRest.lastResponse().getBody().jsonPath().getList("");
        System.out.println("resultList: "+resultList.size());
        actor.attemptsTo(
                Ensure.that(CurrentSearchResultCount.information())
                        .contains(resultList.size() +" results have been found.")
        );
       /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
