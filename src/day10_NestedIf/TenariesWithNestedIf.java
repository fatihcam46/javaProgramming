package day10_NestedIf;

public class TenariesWithNestedIf {
    public static void main(String[] args) {

        int s =55;
       /*
        if(s>=0 && s<=100){   // if the score is valid

            if (s>=60){
                System.out.println("Passed");    // if student passed the exam
            }else{
                System.out.println("Failed");  // if student failed the exam
            }
        }else{   // if the score is not valid
            System.out.println("Invalid score");
        }
             */
       String result = (s>=0 && s<=100)?(s>=60)?"Passed": "Failed":"Invalid score";
        System.out.println( result);

    }
}
