/* multi line comments
aaaaaasssssddddddd
sssdddeee
cfd
 */
package day03_EscapeSquences; //bu slash sadece yorum icin kullanilabilir    package name of this class
public class Println_VS_Print2 {
    public static void main(String[] args) { //
        System.out.println("Knock Knock");// first it prints knock knock
        System.out.print("Who is this? ");
        System.out.println("This is Java.");
        System.out.println("-------------------");

        System.out.print("Knock Knock ");//  it prints knock knock does not append new line
        System.out.print("Who is this ");
        System.out.print("This is Java");
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Hello everone? How are you all today? Today we wil learn Escape Squences");
        System.out.println("--------------------------");
        System.out.print("How are you all today? ");
        System.out.print("Today we wil learn Escape Squences");
    }
}
