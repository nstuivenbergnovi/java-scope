package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInternationalPhoneNumber() {
        //Hieroner was sprake van variable shadowing.
        String internationalPhoneNumber = "+31" + this.phoneNumber;

        return internationalPhoneNumber;
    }
}
