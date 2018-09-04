import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k=0;
        for(int i =0;i<n;i++)
        {
        	int x = input.nextInt();
        	if(x==0)
        	{
        		k++;
        	}
        }
        
        
        System.out.print(k);
       	
       
        
    }
}