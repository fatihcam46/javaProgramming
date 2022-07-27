package day23_practice_tasks;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int number = 56;
        posNegZero(number);
    }
    public static void posNegZero(int number){
        String result = (number>0)? "Positive" :(number<0)?"Negative" : "Zero";
        System.out.println(result);
    }
}
/*
	11. create a method that can if the given integer is positive, negative or zero
 */
