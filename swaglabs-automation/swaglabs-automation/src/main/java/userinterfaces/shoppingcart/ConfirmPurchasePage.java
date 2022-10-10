package userinterfaces.shoppingcart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPurchasePage {


    public static final Target CONFIRM_PURCHASE_BUTTON = Target.the("CONFIRM PURCHASE BUTTON").located(By.xpath("//*[@id='finish']"));

}
