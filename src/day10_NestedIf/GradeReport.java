package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*
        90~100: excellent        80~89: great        70~79: Good        60~69:Passed        0~59:failed
         */
        int score = 125;
        if(score>=0 && score<=100){  // 5 possibilities  A B C D F
              if(score>=90){   // fails score <90
                  System.out.println("Excellent");
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
        System.out.println("---------------------------------------------------");
        String result = "";  //temporary
        if(score>=0 && score<=100){  // 5 possibilities  A B C D F
            if(score>=90){   // fails score <90
                result = "Excellent";
            }else if(score >=80) {
                result ="Great";
            }else if(score >=70) {
                result ="Good";
            }else if(score >=60) {
                result ="Passed";
            }else if(score >=0) {
                result ="Failed";
            }
        }else{   // if the score is not valid  // outcome is 1  invalid score
            System.out.println("Invalid Score");
        }
        System.out.println(result);










    }
}
