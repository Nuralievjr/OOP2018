import java.util.Scanner;
 
public class acmp {

	public static int minw(int a, int b, int c, int d)
	{
		int ab = Math.min(a,b);
		int cd = Math.min(c,d);
		int abcd = Math.min(ab,cd);
		return abcd;
	}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.print(minw(a,b,c,d));
    }
}