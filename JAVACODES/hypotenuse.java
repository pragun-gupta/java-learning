package JAVACODES;

import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){

        //HYPOTENUSE C = Math.sqrt(A^2 + B^2)

        Scanner sc = new Scanner(System.in);
        
        double a;
        double b;
        double c;

        System.out.print("Enter the lenght of side a: ");
        a = sc.nextDouble();

        System.out.print("Enter the lenght of side b: ");
        b = sc.nextDouble();
        
        System.out.println(a);
        System.out.println(b);


        c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));

        System.out.println("the hypotenuse is: " + c +"cm");


        sc.close();
    }
}
