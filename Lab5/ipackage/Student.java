package ipackage;


public class Student {

    String name;
    String surname;
    int score;

    public Student() {}
    public Student(String n,String sn, int s)
    {
        this.name=n;
        this.surname = sn;
        this.score = s;
    }



    public int compareTo(Object o) {
        Student st = (Student) o;
        int rollno1 = this.score;
        int rollno2 = st.score;

        return rollno2-rollno1;

    }

}
