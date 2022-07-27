package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
        // index:      01234

        char thirdChar = word.charAt(2);  //3. yu istersek 2 yazariz
        System.out.println("thirdChar = " + thirdChar);

       /* char tenthChar = word.charAt(9);   // out of range
        System.out.println("tenthChar = " + tenthChar);   */
  System.out.println("------------------------------------");
            String s1 = "Batch 25 is the best Batch. Java programming language";   //sayfa altindan da ogrenebiliriz
            int totalChars = s1.length();
             System.out.println("totalChars = " + totalChars);

               char lastChar = s1.charAt(s1.length()-1);   //last index number
               System.out.println("lastChar = " + lastChar);

   System.out.println("------------------------------------");
            String str = "wooden spoon";
            str = str.toUpperCase(); // WOODEN SPOON
        System.out.println(str);
 System.out.println("------------------------------------");
        String sentence = "TODAY is a great day to learn JAVA programming.";
        sentence = sentence.toUpperCase();
        System.out.println( sentence);
  System.out.println("------------------------------------");
  String sentence2 = " MY NAME IS Fatih.";
  sentence2 = sentence2.toLowerCase();
        System.out.println( sentence2);

    }
}
