import java.util.Scanner;

public class Scan {

    /*class scanner: a simple text scanner which can parse primitive types and strings using regular expressions.
      A scanner breaks its input into tokens using a delimiter pattern,which by default matches whitespace.
      For example : this code allows a user to read a numner from System.in;
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();    */
    
    public static void main(String[] args){            
        Scanner sc = new Scanner(System.in);
        
        //TO READ A STRING
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // if String name = sc.next();     output will not take any spaces between the words.
        //                              Ex: Enter your name: pragun gupta
        //                                  Hello pragun

        //TO READ A INTEGER
        System.out.print("Enter your age: ");
        int age =  sc.nextInt();           //only integer variable

        System.out.print("What is your GPA? :");
        double gpa = sc.nextDouble();            // For a double variable

        System.out.print("Are you a student (true /false) :");
        boolean isStudent = sc.nextBoolean();           //For a boolean varianble

        System.out.println("Hello " + name);
        System.out.println("You are "+ age +" years old");
        System.out.println("Your gpa is " + gpa);
        System.out.println("student ?? : "+ isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student ");

        }else{
            System.out.println("you are NOT enrolled");
        }

        sc.close();

    }
}
