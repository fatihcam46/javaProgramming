package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 65;
        if(ch >='0' && ch <='9'){
            System.out.println("Digit");
            // }else if((ch>= 'A' && ch<= 'Z') || (ch >= 'a' && ch<= 'z')){
        }else if((ch>= 65 && ch<= 90) || (ch >= 97 && ch<= 122 )){   //  ASCII table dan bakilarak sayilar yazildi
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special character");
        }
        System.out.println("---------------2nd way------------------------");
        String result1 = (ch >='0' && ch <='9')? "Digit" : (ch>= 65 && ch<= 90) || (ch >= 97 && ch<= 122 ) ?
                "Alphabetic": "Special character";
        System.out.println( result1);
    }
}
