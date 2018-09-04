import java.util.Scanner;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int a =  input.nextInt();
        int b = input.nextInt();
        for (int i = a; i <= b; ++i)
    	{
        if(i%2==0)
            System.out.print(i+" ");
    	}


    }
}