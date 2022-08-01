package Strings;

public class testNEW {
    public static void main(String[] args) {
        int a = 25;
        System.out.println(--a);//24

        int b= 40;
        System.out.println(++b );//41

        int c = 50;
        System.out.println(c--);//50
        System.out.println(c--);//49
        System.out.println(c--);//48
        System.out.println(c--);//47

        int d = 60;       //60+61=121
        System.out.println(d++ + d++);//121
        System.out.println(d++);//61+1=62
        System.out.println(d++);//62+1=63
    }
}
