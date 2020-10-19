package TestelkaJavaForBeginners.GettersAndSetters;

public class Address {

    private String city;
    private String apartament;
    private String street;
    private String postalcode;

    public Address(String city, String street, String apartament) {
        this.street = street;
        this.apartament = apartament;
        this.city = city;
    }

    //public Address2(String city, String street, String apartament, String postalcode) {
        //this(street, apartament, city);
        //this.postalcode = postalcode;
    //}

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getApartament() {
        return apartament;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
