import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a =  input.nextInt();
        
       
        for (int i = 1; i <= 10; ++i)
        {    
            System.out.println(a+" x "+i+" = "+(a*i));
            
       }
    }
}
