package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {
//   System.exit(0): terminates the current program, terminates the JVM
        for (int i = 0; i < 5; i++) {     // i:0  1 2 3 4
            if( i == 3){
                //  break; termintes the loop  0 1 2 sonra wooden spoon
                //  continue; termintaes the current iteration of the loop  3u atloiyor devam ediyor
           System.exit(0);  // terminates the program  // dudruyor  wooden spoona gecmiyor
            }
            System.out.println(i);
        }

        System.out.println("Wooden Spoon");








    }
}
