package day06_PrimitiveTypeCastings;
public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;       //short b = (short)a;  //     (short)a
        int c = b;  // implicit casting   int c = (int)b
        long d = c;  //   (long)c
        float e = d;
        double f = e;
        /* double > float > long > int > short > byte
        	smaller primitives can be directly assigned to larger primitive type
        	larger ptimitives can NOT be directly assigned to smaller primitive types (need to be casted manually)
         */
        int x = 55;   //explicoit casting manually
        short y = (short)x;
        System.out.println(x + " : " + y);
            long j = 1000000;
            short k = (short)j;
        System.out.println( j+" : "+ k);
                double l = 2.5;
                float m = (float)l;
        System.out.println(l+":"+m);
                     double n =10.8;    // 10.8  equals 10
                     int s = (int)n;
        System.out.println(n +":"+s);

        double d1 = 20.5;
        short s1 = (short) d1;  //
        System.out.println(d1 + ":"+ s1);

        float f1 = 30.5F;
        long l1 = (long) f1;
        System.out.println(f1 + ":"+l1);
    }
}
