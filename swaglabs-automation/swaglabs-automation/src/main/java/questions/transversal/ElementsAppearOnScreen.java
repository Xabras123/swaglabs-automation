package questions.transversal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class ElementsAppearOnScreen {

    public static Boolean onScreen(List<Target> pageElements, Actor actor) {

        boolean pageElementsPresent = false;
        for (Target pageElement: pageElements) {

            actor.attemptsTo(
                    Wait.until(the(pageElement) , isPresent()).forNoLongerThan(10).seconds()
            );
            pageElementsPresent = pageElement.resolveFor(actor).isPresent();
            if(!pageElementsPresent)
                return false;

        }

        return pageElementsPresent;
    }



}
