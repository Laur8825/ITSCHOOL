package session6.practice;

import java.util.UUID;

public class User {

    private UUID userId;
    private String firstName;
    private String lastName;
    private int age;
    private boolean oldCustomer;
    private String currentCountry;
    private String emal;
    private String phoneNumber;
    private String singInDate;
    private int currency;
    private String password;
    private UserAdress userAdress;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOldCustomer() {
        return oldCustomer;
    }

    public void setOldCustomer(boolean oldCustomer) {
        this.oldCustomer = oldCustomer;
    }

    public String getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public String getEmal() {
        return emal;
    }

    public void setEmal(String emal) {
        this.emal = emal;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSingInDate() {
        return singInDate;
    }

    public void setSingInDate(String singInDate) {
        this.singInDate = singInDate;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}
