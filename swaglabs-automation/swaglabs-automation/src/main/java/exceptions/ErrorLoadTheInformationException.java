package exceptions;

public class ErrorLoadTheInformationException extends RuntimeException {

    public static final String TRANSFER_ERROR = "ERROR TO SET THE TRANSFER DATA";

    public ErrorLoadTheInformationException(String e) {
        super(e);
    }

}
