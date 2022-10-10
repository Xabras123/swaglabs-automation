package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StoreHomeHeader {

    public static final Target SHOPPING_CART_BUTTON = Target.the("BUTTON TO SEE THE SHOPPING CART").located(By.xpath("//*[@id='shopping_cart_container']"));
    public static final Target USER_OPTIONS_MENU_BUTTON = Target.the("BUTTON TO SEE THE USER OPTIONS MENU").located(By.xpath("//*[@id='menu_button_container']/div/div[2]"));

}
