package day17_While_DoWHile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";  //how many Java are there?
        int frequency = 0;    // 8-4=4
        while (str .contains("Java")){
            str=str.replaceFirst("Java","");
            frequency++;
            }
        System.out.println(frequency);

        System.out.println("------------------------------------------------");
        
        String sentence ="cat cat DOG DOG";
        int countCat = 0;
        while (sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat","");
            countCat++;
        }
        System.out.println("countCat = " + countCat);


        System.out.println("------------------------------------------------");

        String s = "java java python python";
        int countJava =0;
        int countPython=0;
        if(s.contains("java")) {
            s = s.replaceFirst("java", "");
            countJava++;
        }
        if(s.contains("python")) {
            s = s.replaceFirst("python", "");
            countPython++;
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


            }
}
