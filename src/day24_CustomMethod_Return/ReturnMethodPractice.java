package day24_CustomMethod_Return;

public class ReturnMethodPractice {  // reusebile , if use after use , use...===> use return method
    // if

        public static void main(String[] args) {

            // find the max number between 100 & 200
            int maxNumber = max(100, 200);

            System.out.println(maxNumber); // which is max:200

            // multiply the max number by 2
            // it allows to use max number==> reuse,reuse

            int multiplication = maxNumber * 2;
            System.out.println("multiplication = " + multiplication);
        }
        public static int max(int a, int b){ // void  yazilmadan devam ediliyor. return method oldgndn
            int result = 0;
            if(a > b){
                result = a;
            }else{
                result = b;
            }
            return result;
        }  // there is no print statement==> print olmadan devam edyrz
}
