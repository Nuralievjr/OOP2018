package Task2;


import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.security.Key;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;



public class Main {
    private static ArrayList<Course> courses = new ArrayList<>();

    private static void Logged() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter username!!!");
        String username = in.nextLine();
        System.out.println("Please enter password!!!");
        String pass = in.nextLine();



        File file = new File("admin.txt");
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Username: "+ username+"\n"+"Password: " +pass+"\n");
        bw.write(Calendar.getInstance().getTime() + " admin logged in to a system"+"\n");
        bw.flush();
        bw.close();

        System.out.println("Success!!");
    }


    private  static  void process(int n) throws IOException {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("You are entering " + i + "-nth course");
            System.out.println("Please enter title of course!");
            String courseTitle = in.nextLine();


            Course course = new Course();

            Textbook t = new Textbook();
            Instructor ins = new Instructor();


            course.setCourseTitle(courseTitle);
            course.setBook(t.readBook());
            course.setTeacher(ins.readTeacher());

            courses.add(course);
            File file = new File("admin.txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(Calendar.getInstance().getTime() + " admin added new course "+"<<"+course.getCourseTitle()+">>"+"\n");
            bw.write(Calendar.getInstance().getTime() + " admin added new textbook "+"<<"+ course.book.getTitle()+">>" +"\n");
            bw.write(Calendar.getInstance().getTime() + " admin added new instructor "+"<<"+course.teacher.getName()+" "+course.teacher.getSurname()+">>"+"\n");

            bw.flush();
            bw.close();

        }
    }


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        Boolean over = false;
        int k=1;

        System.out.println("Welcome to Intranet");
        System.out.println("You are in MENU");
        System.out.println("Please choose: a)dmin, u)ser or q)uit");

        while (!over) {
            char command = in.next().charAt(0);
            switch (command) {
                case 'a':

                    Logged();
                    System.out.println("How many courses do you want to enter?");

                    int n = in.nextInt();

                    process(n);

                    System.out.println("Please choose: a)dmin, u)ser or q)uit");
                    break;


                case 'u': {

                    System.out.println("v) View the list of available courses\n" +
                            "d) Display information about the course");
                    char cm = in.next().charAt(0);
                    if(cm == 'v') {
                            for (Course c : courses
                            ) {
                                System.out.println(k+")"+c.getCourseTitle() + " " + c.getBook() + " " + c.getTeacher());
                                k++;
                            }
                        }
                        if(cm=='d')
                        {
                            Scanner c = new Scanner(System.in);
                            System.out.println("Which course do you wanna see in detail?");
                            for (int i = 0;i<courses.size();i++)
                            {
                                System.out.println(i+1+"."+courses.get(i).getCourseTitle());
                            }
                            int choice = c.nextInt();
                            System.out.println(courses.get(choice-1).toString());
                        }
                        break;
                    }


                case 'q': {
                    System.out.println("Bye!!!");
                    over = true;
                    break;
                }


            }
        }

    }




}

