import java.util.Scanner;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int n =  input.nextInt();
        if(n % 4 == 0 && n % 100 != 0)
        {
        	System.out.print("YES");
        }
        else if(n % 400 == 0){
        	System.out.print("YES");

        }
        else{
        System.out.print("NO");
    	}  
 

    }
}