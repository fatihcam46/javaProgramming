package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "James King",
                buildingNumber = "11238B",
                streetName = "Jones Branch Dr",
                city = "Mclean",
                state = "VA",
                zipCode = "22031A";
      /*  System.out.println(name + "\n" + buildingNumber +" "+ streetName + "\n" +city +", "
                +state + " "+ zipCode);

       */
        String address = name + "\n" + buildingNumber +" "+ streetName + "\n" +city +", "
                +state + " "+ zipCode;
        System.out.println(address);

/*
        James King
        11238B Jones Branch Dr
        Mclean, VA 22031A

         */


        /*String name = "James King";
        String  buildingNumber = "11238B";
        String  streetName = "Jones Branch Dr";
        String  city = "Mclean";
        String  state = "VA";
        String  zipCode = "22031A";
          */



    }


}
