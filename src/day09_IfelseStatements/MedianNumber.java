package day09_IfelseStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10 , b = 45 , c = 20;
        boolean aIsMedian =(a>b && a<c) || (a>c && a<b);
        boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
        boolean cIsMedian = (c>b && c<a) || (c>a && c<b);  // boolean cIsMedian=!aIsMedian  && bIsMedian;

        if(aIsMedian){
            System.out.println(a + " is the median number");        }
        if(bIsMedian){
            System.out.println(b+" is the median number");        }
        if(cIsMedian){
            System.out.println(c+" is the median number");        }





    }


}





