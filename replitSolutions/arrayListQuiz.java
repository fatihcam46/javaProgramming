import java.util.ArrayList;
import java.util.Arrays;

public class arrayListQuiz {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);numbers.add(2);numbers.add(3);
        Integer aa =1;
        numbers.remove(aa);

        System.out.println("numbers = " + numbers);
        System.out.println("----------2---------------------");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("green");colors.add("red");colors.add("blue");colors.add("yellow");
        colors.add(3,"cyan");
        System.out.println("colors = " + colors);

        System.out.println("-------------3-------------------");

        ArrayList<Integer> list = new ArrayList<>();
        Integer a =1;
        System.out.println(list.remove(a));

        System.out.println("------------4-------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));
        list2.set(0,list2.get(4));
        list2.set(4,list2.get(0));
        System.out.println("list2 = " + list2);

        System.out.println("-------------5-------------------");

        ArrayList<Character> list3 = new ArrayList<>();
        for(char i='a'; i<='z';i++){
            list3.add(i);
        }
        boolean result = list3.containsAll(Arrays.asList('a','c','D'));
        System.out.println("result = " + result);

        System.out.println("-------------6-------------------");


        ArrayList<Integer> list6 = new ArrayList<>();
        list6.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for(Integer each:list6){
            if(each %2!=0){
                continue;
            }
            System.out.println(each+" ");
            break;
        }

    }
   
    
}
