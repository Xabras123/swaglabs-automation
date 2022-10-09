package exceptions;

public class ElementNotFoundException extends RuntimeException {
    public static final String CLICK_ELEMENT_ERROR = "ERROR TO CLICK THE ELEMENT: ";
    public static final String WAIT_ELEMENT_ERROR = "ERROR TO WAIT THE ELEMENT: ";
    private static final long serialVersionUID = 1L;

    public ElementNotFoundException(String e) {
        super(e);
    }
}
