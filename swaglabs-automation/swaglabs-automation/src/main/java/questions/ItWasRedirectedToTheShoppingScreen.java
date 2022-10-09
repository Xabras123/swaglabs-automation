package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.homepage.StoreHomePage.*;


public class ItWasRedirectedToTheShoppingScreen implements Question<Boolean> {


    public ItWasRedirectedToTheShoppingScreen() {  }



    @Override
    public Boolean answeredBy(Actor actor) {

        List<Target> shoppingScreenElements = new ArrayList<Target>();
        shoppingScreenElements.add(SHOPPING_CART_BUTTON);
        shoppingScreenElements.add(PRODUCT_FILTER_BUTTON);
        shoppingScreenElements.add(PRODUCTS_INVENTORY_LIST);
        shoppingScreenElements.add(ADD_OR_REMOVE_PRODUCT_BUTTON_LIST);

        return ElementsAppearOnScreen.onScreen(shoppingScreenElements, actor);
    }

    public static ItWasRedirectedToTheShoppingScreen page(){
        return new ItWasRedirectedToTheShoppingScreen();
    }
}
