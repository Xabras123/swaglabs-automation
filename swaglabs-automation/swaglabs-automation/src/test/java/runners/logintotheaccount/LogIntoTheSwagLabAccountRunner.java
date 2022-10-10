package runners.logintotheaccount;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/logintotheaccount/log_into_the_swaglabs_account.feature",
        glue = "stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LogIntoTheSwagLabAccountRunner {
}
