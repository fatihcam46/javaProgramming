package day32_Constructors;

public class CarpetObjects {
    public static void main(String[] args) {
//
        Carpet carpet1 = new Carpet(3, 5, 8, true);
        Carpet carpet2 = new Carpet(5,8,12,false);

        System.out.println("carpet1 = " + carpet1);
//carpet1 = Carpet{width=3.0, length=5.0, unitPrice= $8.0, isPersian=true, total price= $320.0}

        System.out.println("carpet2 = " + carpet2);
//carpet2 = Carpet{width=5.0, length=8.0, unitPrice= $12.0, isPersian=false, total price= $480.0}


    }
}
