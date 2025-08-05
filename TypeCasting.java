public class TypeCasting {
    public static void main(String[] args) {
        //Implicit Type Casting
        short a = 40;
        int b = a; 
        long l = a;
        float f = a;
        double d = a;
        
        System.out.println("# Implicit Type Casting #");
        System.out.println("Short Data type: "+a);
        System.out.println("Short to int: "+b);
        System.out.println("Short to long: "+l);
        System.out.println("Short to float: "+f);
        System.out.println("Short to double: "+d);

        //Explicit type casting
        double x = 145.396196;
        float y = (float)x;
        long z = (long)x;
        int k = (int)x;
        short s = (short)x;

        System.out.println("# Explicit Type Casting #");
        System.out.println("Double Data type: "+x);
        System.out.println("Double to float: "+y);
        System.out.println("Double to long: "+z);
        System.out.println("Double to int: "+k);
        System.out.println("Double to short: "+s);



    }
}
