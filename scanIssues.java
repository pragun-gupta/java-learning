import java.util.Scanner;

public class scIssues {
    public static void main(String[] args){

        // COMMON ISSUE
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age : ");
        int age = sc.nextInt();                

        //if you only use the above line it will generate a issue of input buffer
        /*  Enter your age : 
           12
           Enter your favourite color; 
           You are 12 years old
           You like the color */
        // to fix this issue we use the following line also for integer or double

        sc.nextLine();     //To clear the input buffer

        System.out.println("Enter your favourite color; ");
        String color = sc.nextLine();

        System.out.println("You are "+ age + " years old");
        System.out.println("You like the color "+ color);


        sc.close();
    }
}
