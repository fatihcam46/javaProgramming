package Loops;

import java.util.Scanner;

public class EachLetterAndFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write one word:");
        String word = input.nextLine();
        for(int i=0;i<word.length();i++)        {
            System.out.println(word.charAt(i));
        }
        //Given a String, use a loop to print every character from the String on a new line.
//        Examples: Input: hello
//        h
//        e
//        l
//        l
//        o

        System.out.println("----------factorial-------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Write one number:\nLet`s find factorial of this number");
        int number = scan.nextInt();
        long result=1; //0! equals 1
        while(number>0)        {
            result= result*number;
            number--;
        }
        System.out.println(result);
    }
}

  /*
         long sum =1;
    for(int i =1;i<=n;i++){
      sum *= i;
    }
    System.out.println(sum);
  }
         */