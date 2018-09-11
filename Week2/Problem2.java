import java.util.Scanner;
class StarTriangle
	{
		int width;
        String res;
		public StarTriangle(int w)
		{
			this.width = w;
            res= "";
		}

		public void  toString()
		{						
		
			for(int i = 1; i <= width; ++i)
    		{
		        for(int j = 1; j <= i; ++j)
		        {
		             res+=("[*]");
                    res+="\n";
		        }
                return res;
        	 
			

			}
		}
		
	}
	
public class acmp {
	

    public static void main(String []args){

    	StarTriangle t = new StarTriangle(3);
    	System.out.println(t.toString());
       

    }

}
