package userinterfaces.shoppingcart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {

    public static final Target CHECKOUT_BUTTON = Target.the("BUTTON TO CONTINUE TO THE CHECKOUT").located(By.xpath("//*[@id='checkout']"));

}
