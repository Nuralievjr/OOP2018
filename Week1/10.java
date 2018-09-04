import java.util.Scanner;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int a =  input.nextInt();
        int b = input.nextInt();
        int c =  input.nextInt();
        int d = input.nextInt();
        for (int i = a; i <= b; ++i)
   	 	{
        	if(i%d==c)
            System.out.print(i+" ");
    	}


    }
}