import java.util.Scanner;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int a =  input.nextInt();
       

        System.out.print("The next number for the number "+a+" is "+(a+1)+".");
        System.out.print("\nThe previous number for the number "+a+" is "+(a-1)+".");

    }
}