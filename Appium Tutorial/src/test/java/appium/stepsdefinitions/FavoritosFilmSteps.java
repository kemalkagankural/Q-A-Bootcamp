package appium.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FavoritosFilmSteps {

    FavoritoFilmes favoritoFilmes;


    public FavoritosFilmSteps(){
        favoritoFilmes = new FavoritoFilmes();
    }
    @Given("^User without favoritos opens favoritos tab$")
    public void user_without_favoritos_opens_favoritos_tab() throws Throwable {

        favoritoFilmes.swipeForFavoritos();

    }

    @When("^Favoritos screen is opened$")
    public void favoritos_screen_is_opened() throws Throwable {
        Assert.assertTrue(favoritoFilmes.isFavoritoScreenDisplayed());
    }

    @Then("^Default message appeared$")
    public void default_message_appeared() throws Throwable {

        Assert.assertEquals("Você ainda não favoritou nenhum filme, que tal começar agora? (:"
                ,favoritoFilmes.getDefaultMessage());
    }
}
