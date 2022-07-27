package day15_practice_tasks;

public class sumOfDigits {
    public static void main(String[] args) {
        /*        Write a program that can return the sum of digits from a  string
             Ex:                 input: A1B2C3
                 output:    6
             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...         */
        String str = "A1B2C3D4E5T7UK98L9M9";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                sum += ch - 48;
            }
        }

        System.out.println("sum = " + sum);




    }
}
