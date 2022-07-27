package day17_While_DoWHile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog cAt CAT caT";  //how many Java are there?
        int frequency = 0;    // 8-4=4
        for (int i = 0; i <= str.length()-3; i++) {  //i:0,1,2,3      //  i < str.length()-3
            String eachSub = str.substring(i,i+3);
            //  System.out.println(eachSub);
            if(eachSub.equals("Cat")){  // equals method oldugundan 2 cats are there
                /*   if(eachSub.equalsIgnoreCase("Cat")){
                    frequency++;
                }
                 */
                frequency++;

                }

        }
        System.out.println(frequency);











    }
}
