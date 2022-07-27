package day16_ForLoopStringPractice;
public class reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        // index :    01234567...

        String result ="";            // contain the reversed version of str
                //noop nedooW
          // result +=str.charAt(str.lenght()-1);  //last karakter  ===> str.length()-1
       /*
        result += str.charAt(11);  // n
        result += str.charAt(10); //o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7); //S
        result += str.charAt(6); // ' '
        result += str.charAt(5); //n
        result += str.charAt(4); //e
        result += str.charAt(3); //d
        result += str.charAt(2); //o
        result += str.charAt(1); //o
        result += str.charAt(0); //W

*/    // why we need loop??
        for(int i = str.length()-1; i>=0; i--){     //initialization i = 11;   condition i>=0   iteration i--
            result +=  str.charAt(i);               // charAt  metoduyla karakterleri aliyoruz
        }                                           //kac karakter olursa olsun sondan basa yazacak
        System.out.println(result);                  //adding each character to result

        /*         Write a program that can reverse a String
			Ex:			input:
					Wooden Spoon
				output:
					noopS nedooW
         */

        System.out.println("--------------------------------------------------");
        String str1 = "I love Java Programming language";
        String result1 ="";
        for(int i = str1.length()-1; i>=0; i--){     //initialization i = 11;   condition i>=0   iteration i--
            result1 +=  str1.charAt(i);               // charAt  metoduyla karakterleri aliyoruz
        }                                           //kac karakter olursa olsun sondan basa yazacak
        System.out.println(result1);

    }
}
