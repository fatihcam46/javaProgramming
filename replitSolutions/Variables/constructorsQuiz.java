package Variables;

public class constructorsQuiz {
    public constructorsQuiz(){
        System.out.println("Developer");

    }
    public void constructorsQuiz(int a){

        System.out.println("SDET ");

    }
    public constructorsQuiz(double c){
        this();

        System.out.println("C ");

    }

    public static void main(String[] args) {
        constructorsQuiz obj = new constructorsQuiz();
    }
}
