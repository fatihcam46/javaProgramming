package day23_practice_tasks;

public class CalculateGrade {
    public static void main(String[] args) {
            int score = 89;
            grade(score);

    }

    public static void grade(int score) {
        String grade = "Invalid score";
        if(score >=0 && score<= 100){
            grade = (score >= 90)?"A" :(score >= 80)?"B" :(score >= 70)?"C" :(score >= 60)?"D" : "E";
        }

        System.out.println("grade = " + grade);
    }
/*
5. create a method that can calculate the grade of the student based on the score
 */
}