package co.cydeo.lab7_ClassAndObject;

public class Address {

    public String buildingNumber,street, city,state,zipCode;

    //public static String country = "USA"; static one copy for each object


    public void setInfo(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString(){
        return buildingNumber+ " " + street + "\n" + city + ", " + state + " " + zipCode;
    }
}
