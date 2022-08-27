package day33_practice_tasks;

public class AddressTask5 {
    public int buildingNumber;
    public String street,city,state,zipCode;
    public static String country="UK", planet="Earth";

    public AddressTask5(int buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber+" "+street+","+"\n"+city+", "+state+", "+zipCode;
    }
}
/*
Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */