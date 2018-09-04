import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        int sum=0;
        for(int i =0;i<100;i++)
        {
        	int x = input.nextInt();
        	sum+=x;
        }
        
        
        System.out.print(sum);
       	
       
        
    }
}