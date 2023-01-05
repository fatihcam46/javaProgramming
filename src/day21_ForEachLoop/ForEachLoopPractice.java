package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds","Angrys Birds"};
                for(String each:words){  // each   can be any name
                    System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
                    // each first and last character     Jg  Cl   Wn  Es  As
                }














    }
}
