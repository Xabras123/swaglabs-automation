package runners.purchase_product.purchase_product;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/purchaseproduct/purchase_product.feature",
        glue = "stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PurchaseProductRunner {
}
