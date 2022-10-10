package tasks.purchaseproduct;


import exceptions.TheElementNotVisibleError;
import interactions.TapTheButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AddToTheShoppingCartTheItems implements Task {
    private List<String> items;

    public AddToTheShoppingCartTheItems(List<String> items) {

        this.items = items;

    }

    public static Performable from(List<String> items) {
        return instrumented(AddToTheShoppingCartTheItems.class, items);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String buttonXpathString;
        Target ADD_PRODUCT_BUTTON_LIST;

        for(String singleProductName : items){
            buttonXpathString = "//*[contains(@id, 'add-to-cart-sauce' )  and ./parent::*[@class='pricebar' and ./preceding-sibling::*[@class='inventory_item_label' and ./child::*[ contains(@id,'title_link')  and ./child::*[contains(text(), '"+ singleProductName + "')]]]]]";
            ADD_PRODUCT_BUTTON_LIST = Target.the("LIST OF THE BUTTONS TO REMOVE OR ADD PRODUCTS TO THE SHOPPING CART").located(By.xpath(buttonXpathString));
            try{
                theActorInTheSpotlight().attemptsTo(
                        TapTheButton.called(ADD_PRODUCT_BUTTON_LIST)
                );
            } catch (Exception e) {
                throw new TheElementNotVisibleError(TheElementNotVisibleError.ELEMENT_NOT_VISIBLE
                        + e.getMessage(), e);
            }
        }
    }

}
