package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {
        //
        String str = "aabccdee";
// loop we use==>
        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));
            if(frequency == 1){ // unique character we took==> 1
                System.out.println(str.charAt(i)); // b   d
            }
        }
    }
// frequency int value we need==> void we did not use

    //                              "aaa"      'a'
    public static int frequency(String str, char ch){

        int count = 0;  // for each loop we use==>

        for (char each : str.toCharArray()) {
            if(each == ch){
                count++;
            }
        }
        return count;
    }

}
