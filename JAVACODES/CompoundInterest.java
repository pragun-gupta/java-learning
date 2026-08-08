package JAVACODES;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String [] args){

        // Compound Interest calculator

        Scanner sc = new Scanner(System.in);
        
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("enter the pinterst rate(in %): ");
        rate = sc.nextDouble() / 100;

        System.out.print("enter the no. of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("enter the no. of years: ");
        years = sc.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded*years);

        System.out.printf("The amount after %d years is %.2f " ,  years , amount);

        sc.close();
    }
}
