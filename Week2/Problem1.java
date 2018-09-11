import java.util.Scanner;
class Student
	{
		public String name;
		public int id;
		public int year;
		public Student()
		{

		}
		public Student(String n, int id)
		{
			this.name = n;
			this.id = id;
		}
		public void set(String n, int i,int yea)
		{
			name = n;
			id = i;
			year = yea;
		}

		public String toString()
		{
			return name + " " + id+ " "+ year;
		}

		
	}
	
public class acmp {
	

    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int id = input.nextInt();
        int year = input.nextInt();
        Student one = new Student();
        one.set(name,id,year);
        System.out.println(one.toString());

    }

}