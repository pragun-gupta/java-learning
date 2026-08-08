import java.util.Scanner;

public class ifstatements {
    //if statement = performs a block of code if its condition is true
    //here statements are executed in a order , if the first one gets executed all the others are ignored
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter the name: ");
        name = sc.nextLine();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("you didn't enter your name.😒");
        }else{
            System.out.println("hello "+ name  + ".😊");
        }


        //GROUP 2
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Are youa student (true/false)");
        isStudent = sc.nextBoolean();

        if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        
        else{
            System.out.println("Your a child !");
        }

        //GROUP 3

        if(isStudent){
            System.out.println("You are a student!");
        }else{
            System.out.println("You are NOT a student");
        }

        sc.close();
    }
}
