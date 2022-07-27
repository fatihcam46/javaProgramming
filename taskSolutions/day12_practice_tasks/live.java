package day12_practice_tasks;

import java.util.Scanner;

public class live {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people they live with:");
        int live = scan.nextInt();
        String str = "";
if(live<3 && live>=0){
    str = "Live with less than 3 people";
}else if(live>=3 && live<=6){
    str = "Live with 3 - 6 people";
}else if(live>6){
    str = "Live with more than 6 people";
}else{
    str = "Invalid Number";
}
        System.out.println("Answer: " + str);
scan.close();


/*         Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */







    }
}
