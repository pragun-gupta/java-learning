import java.util.Random;

public class RandomDemo {
    public static void main(String [] args){
        Random ran = new Random();
    
        //the below will show big number/billion in -ve and +ve, eg -78965454 
        /*int num;
        num = ran.nextInt();
        System.out.println(num);*/
    
        int num1;
        int num2;
        int num3;

        num1 = ran.nextInt(1,101);
        num2 = ran.nextInt(1,101);
        num3 = ran.nextInt(1,101);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        double number;

        number = ran.nextDouble();
        System.out.println(number);

        // boolean can be used in coin flipping situation

        boolean isHeads;

        /*isHeads = ran.nextBoolean();
        System.out.println(isHeads);*/

        isHeads = ran.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }
    }
}
