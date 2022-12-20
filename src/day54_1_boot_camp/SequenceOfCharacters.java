package day54_1_boot_camp;

public class SequenceOfCharacters {

    public static void main(String[] args) {

        String str1 = "cydeo";
        String str2 = "cydeo";

        String str3 = new String("cydeo");
        String str4 = new String("cydeo");

        String str5 = str1.toUpperCase(); // "CYDEO"
        System.out.println(str5);

        str2 = str2.concat("School");   //str2.concat("School"); System.out.println(str2);//cydeo  be careful use new method
        System.out.println(str2);//cydeoSchool

        // StringBuilder stringBuilder = "cydeo";
        //  StringBuffer stringBuffer = "cydeo";

        StringBuffer stringBuffer = new StringBuffer("Cydeo");//Synchronized
        stringBuffer.append(" School");
        System.out.println(stringBuffer);//Cydeo School


        StringBuilder stringBuilder = new StringBuilder("Cydeo");//StringBuilder: Not Synchronized-it is not threatened
        stringBuilder.append(" School");
        System.out.println(stringBuilder);//Cydeo School

    }

}

