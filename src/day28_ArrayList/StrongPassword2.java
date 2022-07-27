package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "WoodenSpoon123";
//how many upper,lower,digit,special,
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){ //check uppercase, increase one by one
                countUpperCase++;
            }else if(Character.isLowerCase(each)){//check lowercase, increase one by one
                countLowerCase++;
            }else if(Character.isDigit(each)){//check digit, increase one by one
                countDigits++;
            }else{                          //check special characeter, increase one by one
                countSpecialChar++;
            }
        }

//how mnay are there??
        /*
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigits = " + countDigits);
         */

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowercase = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialChar = countSpecialChar > 0; //at least8 and no space and must have upper,lower,digit,specl
       // boolean strongPassword = password.length() >= 8 && !password.contains(" ") &&
       //         hasSpecialChar && hasLowercase && hasUpperCase && hasDigit;

        boolean strongPassword =false;

        if(password.length() >= 8){
            if(!password.contains(" ")){
                if(hasUpperCase){
                    if(hasLowercase){
                        if(hasDigit){
                            if(hasSpecialChar){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("strongPassword = " + strongPassword);







    }
}
