package tasks.generalnavigation;

import exceptions.TheElementNotVisibleError;
import interactions.NavigateThroughMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

import static model.entities.HeaderMenuEnum.SHOPPING_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.StoreHomeHeader.SHOPPING_CART_BUTTON;
import static userinterfaces.StoreHomeHeader.USER_OPTIONS_MENU_BUTTON;

public class NavigatesThroughTheHeaderMenu implements Task {

    private String navigationDestination;

    public NavigatesThroughTheHeaderMenu(String navigationDestination) {
        this.navigationDestination = navigationDestination;
    }

    public static Performable to(String navigationDestination) {
        return instrumented(NavigatesThroughTheHeaderMenu.class, navigationDestination);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Target navigationDestinationTarget = theActorSelectsTheItemFromTheMenuToNavigateTo(navigationDestination);
            actor.attemptsTo(
                    NavigateThroughMenu.byTapping(navigationDestinationTarget)
            );
        } catch (Exception e) {
            throw new TheElementNotVisibleError(TheElementNotVisibleError.ELEMENT_NOT_VISIBLE
                    + e.getMessage(), e);
        }
    }

    private Target theActorSelectsTheItemFromTheMenuToNavigateTo(String navigationDestination) {


        switch((navigationDestination)){

            case SHOPPING_CART:
                return SHOPPING_CART_BUTTON;
            default:
                return USER_OPTIONS_MENU_BUTTON;

        }

    }
}
