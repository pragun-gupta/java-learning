public class operators {
    public static void main(String[] args){
        //ARITHMATIC OPERATORS

        int x=  20;
        int y = 3;
        int z;

        //z = x + y;      // Addition
        //z = x - y;      // Substraction
        //z = x*y;        // Multiplication
        //z = x/y;        // Division
        z = x%y;          // Modulus-gives the remainder

        System.out.println(z);

        //ARGUMENTED ASSIGNMENT OPERATORS

        int a = 10;
        int b = 2;

        //a += b;         // Add
        // a -= b;        // Subs
        // a *= b;        // Multiply
        // a /= b;        // Division
        a %= b;           // Modulus

        System.out.println(a);

        //INCREMENT AND DECREMENT OPERATORS

        int c = 2;

        c++;      //Increment
        c--;      //Decrement

        System.out.println(c);

        //ORDER OF OPERATIONS (P-E-M-D-A-S) 

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
