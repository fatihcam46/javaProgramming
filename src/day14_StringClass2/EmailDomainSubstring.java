package day14_StringClass2;

public class EmailDomainSubstring {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";  // domain:between @ and .
       int beginningIndex = email.indexOf("@")+1;
       int endingIndex = email.lastIndexOf(".");
        String domain=email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);
        System.out.println("--------------------------------------------");

        String str1 = "Java is fun , Java is cool, I love Java";
        //             012345678910
        String s1 = str1.substring(0,10+1);// java is fun  // 0 dan basladigimizdan

        int beg = str1.indexOf(" J")+1;
        int end = str1.lastIndexOf(",");
        String s2 = str1.substring(beg, end);  //Java is cool

        String s3 =str1.substring(str1.lastIndexOf("I"));  //I love Java

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

      /*
Write a program that can gte the domain of the email. ( Assume that a valid email is given)
		Ex:			email = Cydeo.School@gmail.com    // @ isareti ni  ve son . yi kullaniriz
		output:			gmail
			email = "School.Cydeo@yahoo.com
		output:			yahoo
 */









    }
}
