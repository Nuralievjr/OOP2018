package Task2;

import java.util.Scanner;

public class Instructor {

    String name;
    String surname;
    String department;
    String email;

    public Instructor(){}
    public Instructor(String n, String s, String d, String e)
    {
        this.name = n;
        this.surname = s;
        this.department = d;
        this.email = e;
    }

    Instructor readTeacher()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter name of instructor!");
        String name = in.nextLine();
        System.out.println("Please enter surname of instructor!");
        String sname = in.nextLine();
        System.out.println("Please enter department of instructor!");
        String dep = in.nextLine();
        System.out.println("Please enter email of instructor!");
        String mail = in.nextLine();
        Instructor i = new Instructor(name,sname,dep,mail);
        return i;
    }

    String getName()
    {
        return this.name;
    }
    void setName(String s)
    {
        this.name = s;
    }
    String getSurname()
    {
        return this.surname;
    }
    void setSurname(String s)
    {
        this.surname = s;
    }
    String getDepartment()
    {
        return this.department;
    }
    void setDepartment(String s)
    {
        this.department =s;
    }
    String getEmail()
    {
        return this.email;
    }
    void setEmail(String s)
    {
        this.email = s;
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+department+" "+email;
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }
}
