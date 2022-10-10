package questions.purchaseproduct;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import questions.transversal.ElementsAppearOnScreen;

import java.util.ArrayList;
import java.util.List;

import static userinterfaces.shoppingcart.SuccessfulPurchasePage.*;


public class ItWasRedirectedToTheSuccessfulPaymentScreen implements Question<Boolean> {


    public ItWasRedirectedToTheSuccessfulPaymentScreen() {  }



    @Override
    public Boolean answeredBy(Actor actor) {

        List<Target> shoppingScreenElements = new ArrayList<>();
        shoppingScreenElements.add(SUCCESSFUL_PURCHASE_TITLE);
        shoppingScreenElements.add(SUCCESSFUL_PURCHASE_IMAGE);
        shoppingScreenElements.add(BACK_HOME_BUTTON);

        return ElementsAppearOnScreen.onScreen(shoppingScreenElements, actor);
    }

    public static ItWasRedirectedToTheSuccessfulPaymentScreen page(){
        return new ItWasRedirectedToTheSuccessfulPaymentScreen();
    }
}
