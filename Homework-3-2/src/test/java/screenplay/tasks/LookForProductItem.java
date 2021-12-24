package screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import screenplay.user_interface.SearchPageElements;
import screenplay.user_interface.TAPracticeHomePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LookForProductItem {
    public static Performable about(String term) {
        return Task.where("{0} look for the "+ term,
                Click.on(SearchPageElements.SEARCH_FIELD),
                //WaitUntil.the(SearchPageElements.SEARCH_FIELD, isClickable()),
                SendKeys.of(term).into(SearchPageElements.SEARCH_FIELD)
                //Enter.theValue(term).into(SearchPageElements.SEARCH_FIELD)
                        .thenHit(Keys.ENTER));
    }
}
