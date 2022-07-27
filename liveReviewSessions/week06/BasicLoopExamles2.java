package week06;

public class BasicLoopExamles2 {
    public static void main(String[] args) {
         /*
        Question-3:
			Write a program that displays
			the number of even numbers between 5 and 50 (included)
                I am asking How Many
         */

        int countOfEvens = 0;
        for(int i = 5; i<=50 ; i++){
            if((i%2)==0){
                ++countOfEvens;
            }
        }
        System.out.println("countOfEvens = " + countOfEvens);

        // & means what??????
        System.out.println(23&10);//23/10=2 remainder 3
    }
}
