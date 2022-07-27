package day14_StringClass2;

public class StringMethod3Substring {   //substring method (beginning index , ending index
    public static void main(String[] args) {

        String word = "Cydeo School";
                //     012345...
        String brand = word.substring(0,  4+1);  //
        System.out.println("brand = " + brand);

        String str = word.substring(6);
        System.out.println("str = " + str);
 System.out.println("--------------------------------------------");
        String word2 = "Java Programming Language";
        String s1= word2.substring(0, word2.indexOf(" "));   //first word:Java //sadece 0 yazilirsa hepsi yaziliyor
        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));  //second word : Programming
        String s3=word2.substring(word2.lastIndexOf(" ")+1);  //  Language
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("--------------------------------------------");

        String word3 = "Python C@ Ruby";
        String s11= word3.substring(word3.indexOf(" "));   //  bosluktan sonrakileri yazdirdi
        String s21=word3.substring(word3.lastIndexOf(" "));  // en son bosluktan sonrakileri yazdirdi
        String s31=word3.substring(word3.lastIndexOf(" ")+1);  //  bosluktan sonraki +1 i yazdirdi
        System.out.println("s1 = " + s11);
        System.out.println("s2 = " + s21);
        System.out.println("s3 = " + s31);



    }
}
