package stepdefinitions.logintotheaccount;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.entities.login.AuthenticationData;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ItWasRedirectedToTheShoppingScreen;
import tasks.logintotheaccount.FillTheLoginForm;
import userinterfaces.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogIntoTheSwagLabAccountStepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver browser;
    private HomePage homePage = new HomePage();



    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("that the user is on the SwagLabs login screen")
    public void thatTheUserIsOnTheSwagLabsLoginScreen() {
        theActorCalled("user").can(BrowseTheWeb.with(browser));
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(homePage));
    }

    @When("that the user authenticates with the username (.*) and the password (.*)")
    public void thatTheUserAuthenticatesWithTheUsernameStandard_userAndThePasswordSecret_sauce(String userName, String userPassword) {

        AuthenticationData theAuthenticationData = new AuthenticationData(userName, userPassword);
        theActorInTheSpotlight().attemptsTo(FillTheLoginForm.with(theAuthenticationData));
    }

    @Then("the user should see it was redirected to the store page")
    public void theUserShouldSeeItWasRedirectedToTheStorePage() {
        theActorInTheSpotlight().should(seeThat(ItWasRedirectedToTheShoppingScreen.page()));
    }


}
