package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*
        Which of the following is false?
Correct Answer
  Strings are the primitive datatype to store characters
  String is immutable
  Strings can be made in two ways
You Answered
  Concatenating anything to a String will turn everything to a String
         */



        String word = "      Winter is coming   ";
        word=word.trim();
        System.out.println(word.length());//16

        System.out.println("---------------------------");
String a = "123";
String b = 5+4+a;
        System.out.println("b = " + b);//9123
        System.out.println("---------------------------");
        String result =3425>(9*1000)?"garden":"patio";
        result.substring(2);
        System.out.println("result = " + result);//patio
        System.out.println("---------------------------");
        String str = "the fox ran under the bridge";
        str = str.substring(4,17);
        str.toUpperCase();
        System.out.println(str+"ground");//fox ran underground
        System.out.println("---------???-------------");
        String s5 = "the game was tied at 2-2";
        String s6 = s5.substring(5);
      int index1 =s5.indexOf("game");
      int index2 =s6.indexOf("game");
       if(index1==index2){
            System.out.println("index1 = " + index1);
        }else{
            System.out.println("index2 = " + index2);
        }
        System.out.println("---------------------------");

        String z ="popcorn";
        z=z.substring(1,5);//8 it cannot >>StringIndexOutOfBoundsException
        if(z.equals("opcorn")){
            System.out.println(z.length());
        }else{
            System.out.println(z.replace("o,","a"));
        }

        System.out.println("----------10-----------");
String aa = "today I will go to the beach";
boolean bb = aa.contains("i");
boolean cc = aa.substring(12).startsWith("go");
String resul= bb && cc? "go" : "dont go";
        System.out.println("resul = " + resul);//"dont go"
        System.out.println("---------11---------12--?????-");
        /*
        The continue statement will only skip the rest of the iteration but the break statement
        will exit the loop completely.
Correct Answer
  True
         */

        for (int i = 0; i < 10; i++) {
            if(i% 2 ==0){
                continue;
            }
            System.out.print( i);//13579

            System.out.println("---13---??????-----------");
int number =5;
while(number<100){
    number+=number;
}
            System.out.println("number = " + number);
            System.out.println("-----???---------");
            
            int c =0;
            do{
                c=c++  + --c - (c%3);
            }while(++c <4);
            System.out.println("c = " + c);
            
        }
        System.out.println("-----????--------");
          String str1 = "The whole time it was raining.";
        do{
            System.out.println(str1.charAt(0));
            str1 = str1.substring(3);//3er 3er yazdir.ne gelirse kaydet

        }while(!str1.isEmpty());// T o miw in
        System.out.println("------------------");

        String str2 = "I will find the lost book";
        String word2="";
        for (int index = str2.length()-1; index <=0; index--) {
            word2 +=str2.charAt(index);
        }
        System.out.println("word2 = " + word2);

       /* System.out.println("------------------");
        String str3 = "cybertek";//2ser 2ser ilerle
        for (int i = 0; i <=str3.length() ; i+=2) {
            System.out.print(str3.charAt(i));
        }
        System.out.println("------------------");

        */ System.out.println("----??? 18---------");
        String input = "today it will be 100 degrees!";
        int n = 0;
        while (n++<input.length()){
            if(n==8){
                continue;
            }else if (n==9){
                break;
            }
            System.out.println(input.charAt(++n));

        }
        System.out.println("----??-------------");

        System.out.println("------?????-20------");
    /*    Scanner inputt = new Scanner(System.in);
        int num1 = inputt.nextInt();int num2 = inputt.nextInt();int iterate = inputt.nextInt();
        int total = 0;
        for (int j = 0; j < iterate; j++) {
            if(j%3==0) continue;
            total += num1+num2;
        }
        System.out.println("total = " + total);
        */

    int count =0;
        for (int x = 0; x < 4; x++) {
            if(x==3) continue;
            for (int d = x+1; d <5 ; d++) {
                count++;
                if(d==3) break;
            }
        }
        System.out.println("count = " + count);



        char chars [] = new char[26];
        boolean[] bool = {true,true,false,true};
      String ssss [] = new String[4];
        System.out.println("---------------??--23---------");

        int [] nums = new int[5];
        int f = 5;
        nums[2] = f--;
        nums[0] = f*2;
        nums[4] = --f+(f-9);
        nums[1] = nums[2];
        nums[3] = nums[f-3];                       //0  1  2  3  4
        System.out.println(Arrays.toString(nums));//8, 5, 5, 8, -3]
        System.out.println("----------anlasildi 24--------------");

        double[] doub =new double[4];                          //0     1    2   3
        doub[0]=1.0;System.out.println(Arrays.toString(doub));//[1.0, 0.0, 0.0, 0.0]
        doub[2]=42.1;System.out.println(Arrays.toString(doub));//[1.0, 0.0, 42.1, 0.0]
        doub = new double[4];System.out.println(Arrays.toString(doub));//[0.0, 0.0, 0.0, 0.0]
        doub[1] = 17.2;System.out.println(Arrays.toString(doub));//[0.0, 17.2, 0.0, 0.0]
        doub[3]=doub.length;
        System.out.println(Arrays.toString(doub));//[0.0, 17.2, 0.0, 4.0]
        System.out.println("-------------------------------");
        byte [] by = new byte[5];
        for (int j = 0; j < by.length; j++) {
            by[j]=(byte)(by[j]*2);
        }
        System.out.println("by = " + by);//array print degil
        System.out.println(Arrays.toString(by));//[0, 0, 0, 0, 0]
        System.out.println("-------------------------------");
        String [] words = {"one", "two","three", "four"};
                String [] other=new String[words.length];
        int index =0;
        for (String wordd:words) {
            other[index++] = wordd+wordd.length();//one harf sayisi3,two3,[one3, two3, three5, four4]
        }
        System.out.println(Arrays.toString(other));

        System.out.println("---------????---28---------");

        int [] arr = {1,3,12,5,24,7,9,10};
        boolean [] bArr=new boolean[arr.length];
        for (int i = arr.length-1; i >-1 ; i--) {
         if(arr[i]%2==0){
             bArr[arr.length-1-i]=true;
         }
        }
        System.out.println(Arrays.toString(bArr));
        System.out.println("---------????---29---------");
        int [] numbers = {14,1,84,97,1243,46};
        int total=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
                total+=3;
                
            }else{
                total+=10;
            }
            if(i%3==0){
                total-=15;
            }
        }
        System.out.println("total = " + total);

        System.out.println("---------????---30---------");

        String[] things = {"house", "shed","slide","zebra","park","garden"};
        for(String s:things){
            switch (s.charAt(1)){
                case'h':
                    System.out.print(1);
                    break;
                case'a':
                    System.out.print(2);

                case's':
                    System.out.print(3);
                    break;
                case'o':
                default:
                    System.out.print(4);

                case'p':
                    System.out.print(5);
                    break;
                case'z':
                    System.out.print(6);
                case'l':
                    System.out.print(7);
                    break;
                case'g':
                    System.out.print(1);//4517452323


            }
        }


    }
}
