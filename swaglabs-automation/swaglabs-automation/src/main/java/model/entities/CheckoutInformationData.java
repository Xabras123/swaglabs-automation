package model.entities;

public class CheckoutInformationData {

    private String name;
    private String lastName;
    private String zipCode;

    public CheckoutInformationData(String name, String lastName, String zipCode) {
        this.name = name;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZipCode() {
        return zipCode;
    }
}
