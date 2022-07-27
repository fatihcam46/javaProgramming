package day15_practice_tasks;

public class StringReverse {
    public static void main(String[] args) {
        /*        Write a program that can reverse any given string
			Ex:	input: 			Wooden Spoon

				output:				noopS nedooW         */
        String str = "Wooden Spoon";
        String result = "";
        for (int i =str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
