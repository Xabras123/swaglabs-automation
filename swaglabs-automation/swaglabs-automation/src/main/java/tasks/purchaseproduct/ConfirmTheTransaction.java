package tasks.purchaseproduct;


import exceptions.TheElementNotVisibleError;
import interactions.TapTheButton;
import model.entities.CheckoutInformationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.shoppingcart.CheckoutInformationPage.*;
import static userinterfaces.shoppingcart.ConfirmPurchasePage.CONFIRM_PURCHASE_BUTTON;

public class ConfirmTheTransaction implements Task {



    public ConfirmTheTransaction() {



    }

    public static Performable byTappingTheOKButton() {
        return instrumented(ConfirmTheTransaction.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            theActorInTheSpotlight().attemptsTo(
                    TapTheButton.called(CONFIRM_PURCHASE_BUTTON)
            );
        } catch (Exception e) {
            throw new TheElementNotVisibleError(TheElementNotVisibleError.ELEMENT_NOT_VISIBLE
                    + e.getMessage(), e);
        }
    }
}
