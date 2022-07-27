package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming","SQL Programming"};
        for (String each : names) { //each:
            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) { // reverse the string
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }
/*
loohcS oedyC
noopS nedooW
gnimmargorP avaJ
gnimmargorP LQS
 */





    }
}
