package model.entities;

public class HeaderMenuEnum {
    public static final String SHOPPING_CART = ("shopping cart");
    public static final String USER_OPTION = ("user options");

    private String value;

    HeaderMenuEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
