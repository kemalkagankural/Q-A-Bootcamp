package appium.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ListFilmSteps {


    ListFilmes listFilm;

    public ListFilmSteps(){
        listFilm = new ListFilmes();
    }

    @Given("^I'm on the movie list$")
    public void ı_m_on_the_movie_list() throws Throwable {

        //uygulamayı açmış olmam lazım
        //ana ekranda mıyım bunun kontrolü
        Assert.assertTrue(this.listFilm.isHomeScreen());
    }

    @When("^to perform a title search \"([^\"]*)\"$")
    public void to_perform_a_title_search(String arg) throws Throwable {
        this.listFilm.type_name(arg);
        this.listFilm.search();
    }

    @Then("^I see the search result$")
    public void ı_see_the_search_result() throws Throwable {
        Assert.assertTrue(listFilm.isDialogMessageAppears());
        Assert.assertEquals("Alguma coisa errada não está certa. Whaaaat?",listFilm.getDialogMessage());
        System.out.println(listFilm.getDialogMessage());
    }


}
