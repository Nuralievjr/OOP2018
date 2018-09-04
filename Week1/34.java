import java.util.Scanner;
 
public class acmp {

	public static int minw(int a, int b)
	{
		int pow = Math.pow(a,b);
		return pow;
	}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(minw(a,b));
    }
}