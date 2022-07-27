package day24_CustomMethod_Return;
public class ReturnMethodPractice4 {
   public static void main(String[] args) {

        String str = "cccccccddddaaaaaaabbbbbbbb";
        str = removeDuplicates(str);

        System.out.println(str);//cdab
    }

    //1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicates(String str){ //example = "aaabbcc" ==> "abc"
// there is no  void
        String result = "";  //create loop==>  fori
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){ // if result does not contain the character  !result
                result += each;
            }
       }
        return result;
    }
}
