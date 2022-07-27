package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming","SQL Programming"};
        for (String each : names) {
            String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);//  C.S   W.S  J.P  S.P
        }
        

        
        
        
        
        
    }
}
