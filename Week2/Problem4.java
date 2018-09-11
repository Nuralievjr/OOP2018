import java.util.Scanner;
class Time
	{
		public int hour;
		public int min;
		public int second;
		String res;
		public Time(int ho, int mi, int sec)
		{
			this.hour = ho;
			this.min = mi;
			this.second = sec;
			res = "";
		}
		public void setTime(int ho, int mi, int sec)
		{
			hour = ho;
			min = mi;
			second = sec;
		}
		public String toUni()
		{
			return hour+":"+min+":"+second;
		}
		public String toSta()
		{
			if(hour<=12)
			{
				res= res+hour+":"+min+":"+second+" "+"AM";
			}
			if(hour>12)
			{
				res = res+(hour-12)+":"+min+":"+second+" "+"PM";
			}
			return res;

		}
		
	}
	
public class acmp 
{
    public static void main(String []args)
    {
    	Time t = new Time(12,5,6);
    	System.out.println(t.toSta());
    	System.out.println(t.toUni());


	}
}	