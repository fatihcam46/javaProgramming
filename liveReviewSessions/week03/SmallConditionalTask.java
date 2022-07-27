package week03;

public class SmallConditionalTask {
    public static void main(String[] args) {
        // if   if else    switch case     while   do while

        //  write an if statement that assign 5 to x ahen y is equal to 20
         /*

          */


        int y = 20; int x;   //there is no x value
       /* if(y==20){

            x=5;
        }else{
            x=0;
        }
        System.out.println("x = " + x);    */


        boolean b = y==20;  // true
        if(b){
            x=5;
        }else{
            x=0;
        }
        System.out.println("x = " + x);

        // complier is DUMB/; you need to tell every step


        System.out.println("---------------------------------");
        char ch1 = 'A', ch2='Z';
        if(ch2>ch1){
            System.out.println("Second character comes after first one");
        }else{
            System.out.println("first character comes after second one");
        }

        System.out.println("---------------------------------");
        /*
        a variable user age;
        if the person is gretaer then 18  >>>>>voting
         */
        int age;  //declare
        age=21;
        String eligibleOrNot= "";
        if(age>=18){
            eligibleOrNot="Eligible";
        }else{
            eligibleOrNot="Not Eligible";
        }
        System.out.println("eligibleOrNot for  voting = " + eligibleOrNot);




    }
}
