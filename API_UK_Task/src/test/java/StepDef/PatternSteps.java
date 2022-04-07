package StepDef;
import ReastAssurtTest.PatternTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class PatternSteps {

   @Given("The user calls Get Pattern PathParameter {string} successfully")
    public void theUserCallsGetPatternPathParameterSuccessfully(String PathParameter) {
        PatternTest.getResponse(PathParameter);
        PatternTest.ValidateResponseStatus();
    }
    @Then("Check numViews {string} value is greater than {string}")
    public void checkNumViewsValueIsGreaterThan(String numViews, String numViewsValues) {
        PatternTest.ValidateNumView(numViews,numViewsValues );
    }
}
