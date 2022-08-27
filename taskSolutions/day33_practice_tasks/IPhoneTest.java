package day33_practice_tasks;

public class IPhoneTest {
    public static void main(String[] args) {

        IPhoneTask4 iPhone = new IPhoneTask4("iphone 12", 120, "Silver", "5.6 inches");

        System.out.println(iPhone);

        iPhone.faceTime(123456789);
        iPhone.faceTime("gmail@yahoo.com");
        iPhone.call(123456789);
        iPhone.text(123456789);
/*
IPhoneTask4{model='iphone 12', price=$120.0, color='Silver', size='5.6 inches'}
iphone 12 is face timing with  number 123456789
iphone 12 is face timing with email gmail@yahoo.com
iphone 12 is calling 123456789
iphone 12 is texting to 123456789
 */

    }
}
