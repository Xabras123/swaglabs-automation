package interactions;

import exceptions.TheElementNotVisibleError;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public  class NavigateThroughMenu implements Task {
    private Target navigationDestination;

    public NavigateThroughMenu(Target navigationDestination) {
        this.navigationDestination = navigationDestination;
    }

    public static Performable byTapping(Target navigationDestination) {
        return instrumented(NavigateThroughMenu.class, navigationDestination);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        try {

            actor.attemptsTo(

                    Wait.until(the(navigationDestination) , isPresent()).forNoLongerThan(15).seconds(),
                    Wait.until(the(navigationDestination) , isClickable()).forNoLongerThan(15).seconds(),

                    Click.on(navigationDestination)
            );



        } catch (Exception e) {
            throw new TheElementNotVisibleError(TheElementNotVisibleError.ELEMENT_NOT_VISIBLE
                    + e.getMessage(), e);
        }
    }
}
