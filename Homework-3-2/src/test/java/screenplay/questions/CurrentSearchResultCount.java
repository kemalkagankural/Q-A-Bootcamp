package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import screenplay.user_interface.SearchPageElements;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CurrentSearchResultCount implements Question<String> {

    public String answeredBy(Actor actor){

        WebDriver driver = getDriver();
        return driver.findElement(By.cssSelector(".heading-counter")).getText();

    }
    public static CurrentSearchResultCount information(){
        return new CurrentSearchResultCount();
    }

}
