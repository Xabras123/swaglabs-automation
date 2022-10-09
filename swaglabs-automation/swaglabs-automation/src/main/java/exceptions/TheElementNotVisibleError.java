package exceptions;

public class TheElementNotVisibleError extends AssertionError{
    public static final String ELEMENT_NOT_VISIBLE = "The element not visible.";

    public TheElementNotVisibleError(String message, Throwable e) {
        super(message, e);
    }
}
