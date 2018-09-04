import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1;i<=x;i++)
        {
        	if(x%i==0)
        	{
        		arr.add(i);
        		
        	}
        }
        Collections.sort(arr);
        for(int counter: arr){
			System.out.println(counter);
		}
       	
       
        
    }
}