package Loops;

public class print80To20 {
    public static void main(String[] args) {

        int start=80;
        int end=20;

        for(int i=start; i>=end ; i=i-2)
        {
            System.out.print(i);
            if(i!=end)
            {
                System.out.print(" ");
            }
        }
    }
}
