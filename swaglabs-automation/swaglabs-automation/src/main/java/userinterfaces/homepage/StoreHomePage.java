package userinterfaces.homepage;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StoreHomePage {

    public static final Target SHOPPING_CART_BUTTON = Target.the("BUTTON TO SEE THE SHOPPING CART").located(By.xpath("//*[@id='shopping_cart_container']"));
    public static final Target PRODUCT_FILTER_BUTTON = Target.the("BUTTON TO FILTER THE PRODUCTS").located(By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select"));
    public static final Target PRODUCTS_INVENTORY_LIST = Target.the("LIST OF THE STORE PRODUCTS").located(By.xpath("//*[@class='inventory_list' and ./parent::*[@class='inventory_container']]"));
    public static final Target ADD_OR_REMOVE_PRODUCT_BUTTON_LIST = Target.the("LIST OF THE BUTTONS TO REMOVE OR ADD PRODUCTS TO THE SHOPPING CART").located(By.xpath("//*[contains(@id, 'add-to-cart-sauce' ) or contains(@id, 'remove-sauce' )]"));

}
