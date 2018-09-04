import java.util.Scanner;
public class acmp {

    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        int a =  input.nextInt();
        int b =  input.nextInt();
        int ak = a*a;
        int bk = b*b;

        System.out.print(Math.sqrt(ak+bk));

    }
}