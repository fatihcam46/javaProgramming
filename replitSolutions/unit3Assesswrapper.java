import java.util.ArrayList;
import java.util.Scanner;

public class unit3Assesswrapper {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.remove(nums.size() - 1);
        nums.add(2);
        nums.add(10);
        nums.add(0, 6);
        nums.remove(1);
        nums.add(-7);
        nums.add(2, 2);
        System.out.println("nums = " + nums);

        System.out.println("---------------------");
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numsss = new ArrayList<>();
        int run = in.nextInt();
        while(run>0){
            run--;
            switch (in.nextInt()){
                case 1:
                    numsss.add(1);
                case 5:
                    numsss.add(50);break;
                case 4:
                   break;
                case 8:
                    numsss.remove(0);break;
                case 10:
                case -1:
                case -42:
                    numsss.add(1,0);
                    break;
                case 55:
                    numsss.add(105);break;
                case 2:
                    numsss.add(20_000);break;
                default:
                    numsss.add(null);
            }
        }
        System.out.println(numsss);

    }
}

