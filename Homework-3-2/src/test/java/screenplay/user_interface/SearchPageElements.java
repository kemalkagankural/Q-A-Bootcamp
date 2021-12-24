package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPageElements {
//
    public static Target SEARCH_FIELD = Target.the("Search box input")
            .located(By.id("search_query_top"));

    public static Target SEARCH_RESULT_COUNT = Target.the("Search count appears")
            .locatedBy(".heading-counter");

}
