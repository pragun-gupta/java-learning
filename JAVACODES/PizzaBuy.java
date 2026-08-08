package JAVACODES;

import java.util.Scanner;

public class PizzaBuy{
    public static void main(String[] args){

        //SHOPPING CART PROGRAM
        
        Scanner sc = new Scanner(System.in);
        
        String Item;
        double price;
        int Quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        Item = sc.nextLine();

        System.out.print("What is the price for each? : ");
        price = sc.nextDouble();

        System.out.print("How many would you like? : ");
        Quantity = sc.nextInt();

        total = price * Quantity;
        System.out.print("Your total is " + currency + total);
        System.out.println(" for "+ Quantity + Item);

        sc.close();


    }
}