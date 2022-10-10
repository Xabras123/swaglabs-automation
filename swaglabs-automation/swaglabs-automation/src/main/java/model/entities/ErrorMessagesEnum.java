package model.entities;

public enum ErrorMessagesEnum {

    LOCKED_USER_ACCOUNT("Epic sadface: Sorry, this user has been locked out."),
    CONFIRMATION_FORM_LAST_NAME_ERROR("Error: Last Name is required");


    private String value;

    ErrorMessagesEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
