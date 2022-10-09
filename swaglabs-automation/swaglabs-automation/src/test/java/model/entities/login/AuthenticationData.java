package model.entities.login;

public class AuthenticationData {

    private String userName;
    private String userPassword;

    public AuthenticationData(String userName, String userPassword) {

        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
