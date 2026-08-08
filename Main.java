@SuppressWarnings("all")

public class Main{
    public static void main(String[] args){
        // THIS IS MY FIRST JAVA PROGRAM

        /*
        This
        is
        a
        multi line 
        comment */

        System.out.println("I like pizza!");
        System.out.println("Its really good!");
        System.out.println("Buy me pizza!");

        // variable = a reusable container for a value
        //            a variable behaves as it is was the value it contains

        // Primitive = simple value stored directly in memory(stack)
        // Reference = memory address (stack) that points to the (heap)

        //  Primitive vs reference             ____________
        //  ---------    ---------            |            |
        //      int         string            |    STACK   |
        //     double       array             |____________|            
        //      char        object            |            |
        //     boolean                        |    HEAP    |
        //     and more                       |____________|
                                        
        // 2 steps to craeting a variable
        // ------------------------------
        // 1. DECLARATION
        // 2. ASSIGNMENT

        int age = 30;     // step 1. declaration and assignment
        int year = 2025;
        int quantity = 2;

        System.out.println(age);
        System.out.println("the year is" + year);

        double price = 5;
        double gpa = 9.16;
        double temperature = -12.5;

        System.out.println("$ " + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);

        boolean isStudent = true;          //camelCase convention naming #isStudent
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);

        String name = "Pragun Gupta";
        String food = "pizza";
        String email = "fake123@gmail.com";

        System.out.println("Hello "+ name);
        System.out.println(food + "is tasty!");
        System.out.println("my email is " + email);
        System.out.println("you are "+ age + " years old.");
        System.out.println("your gpa is " + gpa );


        // all in one 
        System.out.println("you choice is "+ food + " " + year);
        System.out.println("The price is: " + currency +price);
        
        if(forSale){
            System.out.println("there is a "+ food + " to buy");
        }else{
            System.out.println("there is no " +  food + " left.");
            
        }
    }
}