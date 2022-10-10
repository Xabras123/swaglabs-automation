package stepdefinitions.purchaseproduct;

import interactions.TapTheButton;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.entities.CheckoutInformationData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.logintothaccount.ItWasRedirectedToTheShoppingScreen;
import questions.purchaseproduct.ItWasRedirectedToTheSuccessfulPaymentScreen;
import questions.transversal.AnErrorLabelAppears;
import tasks.generalnavigation.NavigatesThroughTheHeaderMenu;
import tasks.purchaseproduct.AddToTheShoppingCartTheItems;
import tasks.purchaseproduct.ConfirmTheTransaction;
import tasks.purchaseproduct.FillTheCheckoutInformationForm;

import java.util.ArrayList;
import java.util.List;

import static model.entities.ErrorMessagesEnum.CONFIRMATION_FORM_LAST_NAME_ERROR;
import static model.entities.HeaderMenuEnum.SHOPPING_CART;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterfaces.shoppingcart.ShoppingCartPage.CHECKOUT_BUTTON;
import static userinterfaces.shoppingcart.SuccessfulPurchasePage.BACK_HOME_BUTTON;

public class PurchaseProductStepDefinitions {





    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @When("the user successfully purchases items from the store")
    public void theUserSuccessfullyPurchasesItemsFromTheStore() {
        List<String> items = new ArrayList<>();
        items.add("Sauce Labs Backpack");
        items.add("Sauce Labs Bike Light");

        CheckoutInformationData theData = new CheckoutInformationData("Alejandro", "Mayorga", "Contratemolo");
        theActorInTheSpotlight().attemptsTo(

                AddToTheShoppingCartTheItems.from(items),
                NavigatesThroughTheHeaderMenu.to(SHOPPING_CART),
                TapTheButton.called(CHECKOUT_BUTTON),
                FillTheCheckoutInformationForm.with(theData),
                ConfirmTheTransaction.byTappingTheOKButton()
        );
    }

    @Then("the user should be redirected a successful payment screen")
    public void theUserShouldBeRedirectedASuccessfulPaymentScreen() {

        theActorInTheSpotlight().should(seeThat(ItWasRedirectedToTheSuccessfulPaymentScreen.page()));
    }

    @Then("the user should be redirected to the home screen when tapping the go back home button")
    public void theUserShouldBeRedirectedToTheHomeScreenWhenTappingTheGoBackHomeButton() {
        theActorInTheSpotlight().attemptsTo(
                TapTheButton.called(BACK_HOME_BUTTON)
        );
        theActorInTheSpotlight().should(seeThat(ItWasRedirectedToTheShoppingScreen.page()));
    }

    @When("the user fails during a purchase because an checkout information error")
    public void theUserFailsDuringAPurchaseBecauseAnCheckoutInformationError() {
        List<String> items = new ArrayList<>();
        items.add("Sauce Labs Backpack");
        items.add("Sauce Labs Bike Light");

        CheckoutInformationData theData = new CheckoutInformationData("Alejandro", "Mayorga", "Contratemolo");
        theActorInTheSpotlight().attemptsTo(

                AddToTheShoppingCartTheItems.from(items),
                NavigatesThroughTheHeaderMenu.to(SHOPPING_CART),
                TapTheButton.called(CHECKOUT_BUTTON),
                FillTheCheckoutInformationForm.with(theData)
        );
    }



    @Then("the user should see an error label on the checkout information screen stating that a problem occurred")
    public void theUserShouldSeeAnErrorLabelOnTheCheckoutInformationScreenStatingThatAProblemOccurred() {
        theActorInTheSpotlight().should(seeThat(AnErrorLabelAppears.onScreen(CONFIRMATION_FORM_LAST_NAME_ERROR.getValue())));

    }


}
