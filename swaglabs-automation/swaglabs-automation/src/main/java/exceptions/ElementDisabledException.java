package exceptions;

public class ElementDisabledException extends RuntimeException{
    public static final String DISABLED_ERROR = "THE ELEMENT IS DISABLED AND ISN'T CLICKABLE";

    public ElementDisabledException(String message) {
        super(message);
    }
}
