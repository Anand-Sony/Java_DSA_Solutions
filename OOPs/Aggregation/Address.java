public class Address {
    private String city;
    private String country;
    private String street;
    private int postNumber;

    public Address(String city, String country, String street, int postNumber) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.postNumber = postNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public int getPostNumber() {
        return postNumber;
    }
}