package day24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str = "java";

        String result =  reverse(str);
        System.out.println(result);

        if(str.equalsIgnoreCase(result)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
    }
    public static String reverse(String str){ //"Java"

        String reverse = "";   // how we reverse it? ==> loop
        for(int i=str.length()-1; i>= 0; i--){  //
            reverse += str.charAt(i); //every single caharacter starting from 0(index) at the end ...
        }
        return reverse;// bunu yazmak ,mecburi
    }
}
