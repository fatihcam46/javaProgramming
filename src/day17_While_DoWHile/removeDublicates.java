package day17_While_DoWHile;

public class removeDublicates {
    public static void main(String[] args) {

        String str ="AABBCC";  //  for loop we must use
        String result ="";  //ABC
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);   //  "A"  "A"   "B"  "B"   "C" "C"
            if(result.contains(ch)){
                continue;  //skips
              }
            result += ch;
        }
        System.out.println(result);




    }
}
