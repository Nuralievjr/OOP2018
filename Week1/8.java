import java.util.Scanner;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int a =  input.nextInt();
        int b = input.nextInt();
    	if(a>b){
		System.out.print("1");
		}	
		if(a<b){
		System.out.print("2");
		}
		if(a==b){
		System.out.print("0");
		}

     
    }
}