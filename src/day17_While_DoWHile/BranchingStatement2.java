package day17_While_DoWHile;

public class BranchingStatement2 {   //continue Statement
    public static void main(String[] args) {

        for ( char i = 'A'; i <= 'E'; i++) {
            if( i == 'C'){
                continue;  //   A B  D E   C olmadan yaziyor
            }
            System.out.println( i);  //
        }
        System.out.println("----------------------------------------------------");
        //print all even numbers 1~10   //
        for (int i = 1; i <11; i++) {
            if (i % 2 != 0) {  //even numbers yazilacak   1,3,5,7,9  yazilmayacak
                continue;  //skip
            }
            System.out.println(i);  //2 4 6 8 10
        }
            System.out.println("----------------------------------------------------");
        //print all odd numbers 1~10   //
        for (int i = 1; i <11; i++) {
            if (i % 2 == 0) {  //odd numbers
                continue;  //skip
            }
            System.out.println(i);  //1 3 5 7 9
        }

/*        branching statements:
			break statement: exits the loop & switch
			continue statement: skips the current iteration

 */





    }
}
