package questions.transversal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class AnErrorLabelAppears implements Question<Boolean> {


    private String errorMessage;
    public AnErrorLabelAppears(String statingThat) {
        this.errorMessage = statingThat;
    }



    @Override
    public Boolean answeredBy(Actor actor) {



        String xpathString = "//*[@data-test='error' and contains(text(), '"+ errorMessage  + "')]";

        Target ERROR_MESSAGE_LABEL = Target.the("ERROR MESSAGE LABEL").located(By.xpath(xpathString));
        actor.attemptsTo(
                Wait.until(the(ERROR_MESSAGE_LABEL) , isPresent()).forNoLongerThan(10).seconds()
        );

        return ERROR_MESSAGE_LABEL.resolveFor(actor).isPresent();
    }

    public static AnErrorLabelAppears onScreen(String statingThat){
        return new AnErrorLabelAppears(statingThat);
    }
}
