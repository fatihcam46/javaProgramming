package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");
        System.out.println(iphone);
        //Phone{brand='Apple', model='Iphone 12', size='6.7 inches', price= $1000.0, color='Black', has battery='true'}

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");
        System.out.println(samsung);
        //Phone{brand='Samsung', model='galaxy S19', size='6 inches', price= $900.0, color='White', has battery='true'}

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");
        System.out.println(nokia);
        //Phone{brand='Nokia', model='Brick', size='4 inches', price= $50.0, color='Gray', has battery='true'}


        iphone.call(911);//Apple Iphone 12 is calling 911
        iphone.text(123456789);//Apple Iphone 12 is texting 123456789
        iphone.faceTime(78945613);
        //Apple Iphone 12  is having a Face Time with phone number: 78945613
        iphone.faceTime("yahoo@gmail.com");
        //Apple Iphone 12 is having a Face Time with email: yahoo@gmail.com

        System.out.println("-------------------samsung------------------");

        samsung.call(911);//Samsung galaxy S19 is calling 911
        samsung.text(123456789);//Samsung galaxy S19 is texting 123456789
        samsung.freeze();//Samsung galaxy S19 is freezing

        System.out.println("------------------nokia---------------------------");

        nokia.call(432109876);//Nokia Brick is calling 432109876
        nokia.text(321098765);//Nokia Brick is texting 321098765
        nokia.selfDefense();//You can use Nokia Brick as self defense tool

        System.out.println("-------------------------------------------------");

        System.out.println( Phone.hasBattery );//true
        System.out.println( Iphone.hasBattery );//true
        System.out.println( Samsung.hasBattery );//true
        System.out.println( Nokia.hasBattery );//true


    }
}
