package userinterfaces.shoppingcart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessfulPurchasePage {

    public static final Target SUCCESSFUL_PURCHASE_TITLE = Target.the("SUCCESSFUL PURCHASE TITLE").located(By.xpath("//*[@id='checkout_complete_container']/h2"));
    public static final Target SUCCESSFUL_PURCHASE_IMAGE = Target.the("SUCCESSFUL PURCHASE IMAGE").located(By.xpath("//*[@id='checkout_complete_container']/img"));
    public static final Target BACK_HOME_BUTTON = Target.the("BACK HOME BUTTON").located(By.xpath("//*[@id='back-to-products']"));

}
