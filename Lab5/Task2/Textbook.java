package Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Textbook {

    String isbn;
    String title;
    String author;
    public Textbook() {}
    public Textbook(String t, String a, String i)
    {
        this.title = t;
        this.author=a;
        this.isbn = i;
    }


    Textbook readBook()
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter title of textbook");
        String title = in.nextLine();
        System.out.println("Please enter author of textbook");
        String author = in.nextLine();
        System.out.println("Please enter isbn of textbook");
        String isbn = in.nextLine();
        Textbook t = new Textbook(title,author,isbn);
        return t;
    }


    String getisbn()
    {
        return this.isbn;
    }
    void setIsbn(String i)
    {
        this.isbn =i;
    }

    String getTitle()
    {
        return this.title;
    }
    void setTitle(String t)
    {
        this.title = t;
    }

    String getAuthor()
    {
        return this.author;
    }

    void setAuthor(String a)
    {
        this.author =a;
    }

    @Override
    public String toString() {
        return this.title+" "+this.author+" "+this.isbn;
    }

    @Override
    public boolean equals(Object obj) {
        Textbook book = (Textbook)obj;
        if(this.isbn == book.isbn)
        {
            return true;
        }
        return false;

    }


}
