package userinterfaces.shoppingcart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutInformationPage {
    public static final Target NAME_INPUT = Target.the("NAME INPUT").located(By.xpath("//*[@id='first-name']"));
    public static final Target LAST_NAME_INPUT = Target.the("LAST NAME INPUT").located(By.xpath("//*[@id='last-name']"));
    public static final Target ZIP_CODE_INPUT = Target.the("ZIP CODE INPUT").located(By.xpath("//*[@id='postal-code']"));
    public static final Target CONTINUE_BUTTON = Target.the("CONTINUE BUTTON").located(By.xpath("//*[@id='continue']"));

}
