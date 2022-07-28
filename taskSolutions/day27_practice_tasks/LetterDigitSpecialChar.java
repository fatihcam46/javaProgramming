package day27_practice_tasks;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {

        String str = "Wooden Spoon!2022";

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isLetter(each)){
                letters += each;
            }else if(Character.isDigit(each)){
                digits += each;
            }else{
                specialChars += each;
            }
        }

        System.out.println("letters = " + letters);//letters = WoodenSpoon
        System.out.println("digits = " + digits);//digits =2022
        System.out.println("specialChars = " + specialChars);//specialChars =  !
    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!2022"
		output:
			letters= "WoodenSpoon";
			Digits = "2022";
			specialChars = " !";
 */