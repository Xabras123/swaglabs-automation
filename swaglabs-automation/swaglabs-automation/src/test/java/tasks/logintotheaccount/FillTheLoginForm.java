package tasks.logintotheaccount;


import exceptions.TheElementNotVisibleError;
import interactions.TapTheButton;
import model.entities.login.AuthenticationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.loginpage.LoginPage.*;

public class FillTheLoginForm implements Task {
    private static final String RESULT = "Fail";
    private String userEmail;
    private String userPassword;

    public FillTheLoginForm(AuthenticationData theAuthenticationData) {

        this.userEmail = theAuthenticationData.getUserName();
        this.userPassword = theAuthenticationData.getUserPassword();

    }

    public static Performable with(AuthenticationData theAuthenticationData) {
        return instrumented(FillTheLoginForm.class, theAuthenticationData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            theActorInTheSpotlight().attemptsTo(
                    Wait.until(the(USERNAME_INPUT), isPresent()).forNoLongerThan(7).seconds(),
                    Enter.theValue(userEmail).into(USERNAME_INPUT),
                    Wait.until(the(PASSWORD_INPUT), isPresent()).forNoLongerThan(7).seconds(),
                    Enter.theValue(userPassword).into(PASSWORD_INPUT),
                    TapTheButton.called(LOGIN_BUTTON)
            );
        } catch (Exception e) {
            throw new TheElementNotVisibleError(TheElementNotVisibleError.ELEMENT_NOT_VISIBLE
                    + e.getMessage(), e);
        }
    }
}
