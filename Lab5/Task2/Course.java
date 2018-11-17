package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Course {
    String courseTitle;
    Textbook book;
    Instructor teacher;
    public Course(){}
    public Course(String t, Textbook b, Instructor ta)
    {
        this.courseTitle = t;
        this.book = b;
        this.teacher = ta;
    }

    String getCourseTitle()
    {
        return courseTitle;
    }
    void setCourseTitle(String title)
    {
        this.courseTitle = title;
    }

    String getBook()
    {
        return book.getTitle();
    }
    void setBook(Textbook b)
    {
        this.book = b;
    }
    String getTeacher()
    {
        return teacher.getName();
    }
    void setTeacher(Instructor i)
    {
        this.teacher = i;
    }

    @Override
    public String toString() {
        return courseTitle+" "+book.toString()+" "+teacher.toString();
    }
}
