package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
          int s = 100;
        String result= (s>=0 && s<=100)? (s>=90)? "Excelent": (s >=80)?"Great":(s >=70)?"Good":
                (s >=60)? "Passed":"Failed":("Invalid Score");
        System.out.println(result);

        System.out.println("--------------------------------------------------------");
// solution 3
        if(s>=0 && s<=100){
            String result2 = (s>=90)? "Excelent": (s >=80)?"Great":(s >=70)?"Good":
                    (s >=60)? "Passed":"Failed";
        }else{
            result = "Invalid Score";
        }
        System.out.println(result );

        System.out.println("--------------------------------------------------------");
        int score = 100;
        if(score>=0 && score<=100){  // 5 possibilities  A B C D F
            if(score>=90){   // fails score <90
                System.out.println("Excelent");
            }else if(score >=80) {
                System.out.println("Great");
            }else if(score >=70) {
                System.out.println("Good");
            }else if(score >=60) {
                System.out.println("Passed");
            }else if(score >=0) {
                System.out.println("Failed");
            }
        }else{   // if the score is not valid  // outcome is 1  invalid score
            System.out.println("Invalid Score");
        }










    }
}
