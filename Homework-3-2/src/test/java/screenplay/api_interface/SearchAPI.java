package screenplay.api_interface;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

public class SearchAPI {

    private EnvironmentVariables environmentVariables;

    @Step
    public String invoke_my_webservice() {
        String webserviceEndpoint =  EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("api.base.endpoint");
        return webserviceEndpoint;
    }
}
