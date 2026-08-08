public class printFloat {
    public static void main(String[]args){
        //printf() = is a method used to format output like float numbers
        // %[flags][width][.precision][specifier-character]

        String name = "Pragun";
        char firstLetter = 'P';
        int age = 18;
        double height = 98.5;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("you are %f inches tall\n", height);
        System.out.printf("Employed : %b\n", isEmployed);

        System.out.printf("%s is %d years old", name , age);

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.3f\n", price1);
        System.out.printf("%.3f\n", price2);
        System.out.printf("%.3f\n", price3);

        // [flags]

        /* + = output a plus
           , = comma grouping seperator
           ( = negative numbers are enclosed in ()
           space = display a minus if negative, space if positive */

        System.out.printf("%+.2f\n", price1);   // +
        System.out.printf("%+.2f\n", price3);   // but will still be negative
        
        int digit = 567000000;
        System.out.printf("%,d\n" , digit);     // ,

        System.out.printf("%(.3f\n", price3);   // (
    
        System.out.printf("% .3f\n", price2);   // a space
        System.out.printf("% .3f\n", price3);

        // [width]

        /* 0 = zero padding
           number = right justified padding
           negative number = left justified padding */

        int id1 = 1;
        int id2 = 23;
        int id3 = 457;
        int id4 = 7890;

        System.out.printf("%04d\n",id1);      // 0 padded to 4 digits
        System.out.printf("%04d\n",id2);       
        System.out.printf("%4d\n",id3);       // only number, give it in right side
        System.out.printf("%-4d\n",id4);      // neg number, give it in left side 

    }
    
}
