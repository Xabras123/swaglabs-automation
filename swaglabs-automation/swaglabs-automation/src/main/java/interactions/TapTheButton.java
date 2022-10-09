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

public  class TapTheButton implements Task {
    private Target button;

    public TapTheButton(Target button) {
        this.button = button;
    }

    public static Performable called(Target button) {
        return instrumented(TapTheButton.class, button);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(


                    Wait.until(the(button) , isPresent()).forNoLongerThan(15).seconds(),
                    Wait.until(the(button) , isClickable()).forNoLongerThan(15).seconds(),
                    Click.on(button)

            );
        } catch (Exception e) {
            throw new TheElementNotVisibleError(TheElementNotVisibleError.ELEMENT_NOT_VISIBLE
                    + e.getMessage(), e);
        }
    }


}