import java.util.Scanner;
class Data
	{
		private double largest;
		private double sum;
		private int count;
		public Data(){
			sum = 0;
			count = 0;
			largest = 0;
		};
		public void addValue(int v)
		{
			sum +=v;
			if (count == 0 || sum < v)
			{
				largest = v;
			}
			count++;
		}
		public double getaver()
		{
			if(count == 0 )
			{
				return 0;
			}
			else 
			{
				return sum/count;
			}
		}
		public double largest()
		{
			return largest;
		}
		
	}
	
public class acmp {
	

    public static void main(String []args){

    	Data data = new Data();
    	Scanner sc = new Scanner(System.in);

    	while(sc.hasNextInt())
    	{
    		int x = sc.nextInt();
    		data.addValue(x);
    	}
    	double aver = data.getaver();
    	double largest = data.largest();
    	
    	System.out.println(aver+" "+ largest);
       

    }

}