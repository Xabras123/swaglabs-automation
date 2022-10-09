package exceptions;

public class JsonReaderException extends RuntimeException {

    public static final String FAILED_CONFIG_JSON_DATA = "ERROR TO GET JSON DATA IN THE FILE";
    public static final String ERROR_CASE_TAGS = "YOU MUST PUT THE ONLY GENERAL TAG AND ITS CASE TAGS";
    private static final long serialVersionUID = 1L;

    public JsonReaderException(String e) {
        super(e);
    }
}
