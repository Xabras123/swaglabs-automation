package exceptions;

public class LoginError extends AssertionError {
    public static final String LOGIN_FAILED = "Inicio de sesion fallido.";
    public static final String LOGIN_SUCCESS = "Inicio de sesion fallido.";

    public LoginError(String message, Throwable e) {
        super(message, e);
    }

}
