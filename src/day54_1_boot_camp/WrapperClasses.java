package day54_1_boot_camp;

public class WrapperClasses {

    public static void main(String[] args) {
//how can we convert objects?
        int a = 100;
        byte b = 28;
        //  Integer a2 = b;
        Integer x = a;
        Byte y = b;

        char ch = '$';

        Character z = ch;
System.out.println("---------------------------------------");

        int q =Integer.parseInt("123");//parse method allows convert
        Integer wrap =Integer.valueOf("123");//value of method is used wrapper class

    }
}
