import java.util.Scanner;
class Time
	{
	}
	
public class acmp 
{
    public static void main(String []args)
    {	
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	
    	int[] arr = new int[x];
    	for(int i = 0 ; i <x;i++)
    	{
    		arr[i] = sc.nextInt();
    		System.out.print(arr[i]+" " + arr[i]+" ");
    	}


	}	
}