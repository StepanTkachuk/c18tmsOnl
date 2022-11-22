package Task1;

public class Address {
    String country;
    String city;
    String allAddress;


    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getAllAddress() {
        return country + " " + city;
    }

}
