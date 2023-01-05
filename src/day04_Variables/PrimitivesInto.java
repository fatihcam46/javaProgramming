package day04_Variables;
public class PrimitivesInto {
    public static void main(String[] args) {
        // age: 38 years old
        byte age = 16;

        // weight: 160 pounds
        // byte weight: 160 160 is out of range  byte num = -129  -129 is out of range
        short weight = 160;  //160 is within the range of short
        // salary: 100000$
        short salary = 10_000;  // 100000 is out of short range
        int salary2 = 100_000;

        //int asset =3_333_333_333;
        long asset = 3_333_333_333L; // LONG oldugunda L ekliyoruz.
// float   double decimal number you can use.
        // tax:0.26
        float tax = 0.26F;
        double PI = 3.14;
        // double float long int short byte

        //integer icin   int    decimal icin double

// # char  more than 1 karakter olmaz
        char ch1 = '#';
        boolean isEmployed = true;  // true ya da false yazilir
        boolean isMarried = false;

        char ch = 35;
        System.out.println("ch = " + ch);
        char ch2 = 15000;
        System.out.println("ch2 = " + ch2);
        



        }
}
