package day33_Statics;

public class TestIphone {

    public static void main(String[] args) {

        System.out.println( Iphone.OS );
        System.out.println( Iphone.madeIn + " : "+Iphone.hasBattery+ " : "+
                        Iphone.isTouchScreen+ " : "+ Iphone. hasFaceTime);
//// static methods does not accept instances
     //   System.out.println(Iphone.model+" : "+ price);
        //I cannot print model and price
    }
}
