import java.util.Scanner;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int a =  input.nextInt();
        int b = input.nextInt();
        int j=0;
    	for (int i = a; i <= b; ++i)
    	{	

        	j=(int)Math.sqrt(i);
        	if(j*j==i){
            System.out.print(i);
       }
    	}


    }
}