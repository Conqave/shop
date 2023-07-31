package address_manager;

public class Address {
    private int id;
    private String name;
    private char[] postCode;
    private String street;
    private char[] houseNumber;
    private char[] apartmentNumber;

    public Address(int id, String name, char[] postCode, String street, char[] houseNumber, char[] apartmentNumber) {
        super();
        this.id = id;
        this.name = name;
        this.postCode = postCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostCode(char[] postCode) {
        this.postCode = postCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(char[] houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartmentNumber(char[] apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char[] getPostCode() {
        return postCode;
    }

    public String getStreet() {
        return street;
    }

    public char[] getHouseNumber() {
        return houseNumber;
    }

    public char[] getApartmentNumber() {
        return apartmentNumber;
    }
}
