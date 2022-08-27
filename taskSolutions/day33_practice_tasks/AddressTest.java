package day33_practice_tasks;

import day31_practice_tasks.Address;

public class AddressTest {
    public static void main(String[] args) {

        AddressTask5 address = new AddressTask5(44, "Abberley Street",
                "Dudley", "West Midlands","DY2 8QY" );

        System.out.println(address+ ","+"\n"+address.country+","+address.planet);



    }
}
