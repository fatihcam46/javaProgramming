package day16_ForLoopStringPractice;
public class DigitLetterSpecialChars {
    public static void main(String[] args) {    // find ==>digit   letter   special char
        String str = "Cydeo12345 School!@# $%WoodenSpoon";  //loop kullanarak yapabilirz

        String digits ="";  // 12345
        String letters="";  //Cydeo     School   WoodenSpoon
        String specialChar="";  //!@#$%
        for (int i = 0; i < str.length() ; i++) {   //last index ===> str.length()  i:index numbers of str(0~last)
            char ch = str.charAt(i);   // ch: each character that we have str
         if(ch >='0'  && ch <= '9'){    //if the character is between '0' to '9'
             digits += ch;
         }else if(ch >='A'  && ch <= 'Z'){   // if the character is between 'A' to 'Z'
             letters += ch;
         }else if(ch >='a'  && ch <= 'z'){    // if the character is between 'a' to 'z'
             letters += ch;
         }else{      // if the character is neither digit nor letter,then it is special char
            if(ch !=' '){  // if the special character is not a space  ==>  boslugu special olarak almiyorz
                specialChar += ch;
            }
         }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);
    }
}
