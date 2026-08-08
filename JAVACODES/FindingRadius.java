package JAVACODES;

import java.util.Scanner;

public class FindingRadius {
    public static void main(String [] args){

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner sc = new Scanner(System.in);
        
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("the circumference is: %.2f cm\n",circumference );
        System.out.printf("the area is: %.2f sq.cm\n" , area);
        System.out.printf("the volume is: %.2f qb.cm\n",volume);

        sc.close();
    }
}
