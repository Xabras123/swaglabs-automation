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

public class FillTheCheckoutInformationForm implements Task {
    private String name;
    private String lastName;
    private String zipCode;


    public FillTheCheckoutInformationForm(CheckoutInformationData checkoutInformationData) {

        this.name = checkoutInformationData.getName();
        this.lastName = checkoutInformationData.getLastName();
        this.zipCode = checkoutInformationData.getZipCode();

    }

    public static Performable with(CheckoutInformationData checkoutInformationData) {
        return instrumented(FillTheCheckoutInformationForm.class, checkoutInformationData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            theActorInTheSpotlight().attemptsTo(
                    Wait.until(the(NAME_INPUT), isPresent()).forNoLongerThan(7).seconds(),
                    Enter.theValue(name).into(NAME_INPUT),
                    Wait.until(the(LAST_NAME_INPUT), isPresent()).forNoLongerThan(7).seconds(),
                    Enter.theValue(lastName).into(LAST_NAME_INPUT),
                    Wait.until(the(ZIP_CODE_INPUT), isPresent()).forNoLongerThan(7).seconds(),
                    Enter.theValue(zipCode).into(ZIP_CODE_INPUT),
                    TapTheButton.called(CONTINUE_BUTTON)
            );
        } catch (Exception e) {
            throw new TheElementNotVisibleError(TheElementNotVisibleError.ELEMENT_NOT_VISIBLE
                    + e.getMessage(), e);
        }
    }
}
