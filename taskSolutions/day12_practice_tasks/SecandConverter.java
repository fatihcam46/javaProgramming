package day12_practice_tasks;
import java.util.Scanner;

public class SecandConverter {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds=scan.nextInt();
        int hours, minutes, seconds;

        seconds=inputSeconds;

        hours = seconds / 3600;// -> hours // 60 * 60
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}