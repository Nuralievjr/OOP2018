import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int k=0;
        for(int i = 1;i<=x;i++)
        {
        	if(x%i==0)
        	{
        		k++;
        		
        	}
        }
        System.out.print(k);
       	
       
        
    }
}