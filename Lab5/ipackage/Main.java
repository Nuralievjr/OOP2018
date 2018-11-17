package ipackage;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
        File f = new File("grades.txt");
        FileWriter fw = new FileWriter(f);

        BufferedWriter bw = new BufferedWriter(fw);
        String s = br.readLine();
        ArrayList<Student> sts = new ArrayList<>();
        FileOutputStream fo = new FileOutputStream("grades.txt");


        while(s!=null)
        {
            String parts[] = (String[]) s.split(" ");
            Student st = new Student(parts[0],parts[1], Integer.parseInt(parts[2]));
            sts.add(st);

            s = br.readLine();
        }

        int best = 0;
        int sum = 0;
        double average=0;
        int min = sts.get(0).score;
        int k =1;

        Collections.sort(sts,Student::compareTo);

        String cc;
        for (Student ss: sts)
        {
            sum += ss.score;
            if(best<ss.score)
            {
                best = ss.score;

            }
            if(min>ss.score)
            {
                min = ss.score;
            }

            if(ss.score>=best-10)
            {

                cc = k+") "+ss.name+" "+ss.surname+" - A"+"\n";
                bw.write(cc);


            }
            else if(ss.score>=best-20)
            {
                cc = k+") "+ss.name+" "+ss.surname+" - B"+"\n";
                bw.write(cc);

            }
            else if(ss.score>=best-30)
            {
                cc = k+") "+ss.name+" "+ss.surname+" - C"+"\n";
                bw.write(cc);

            }
            else if(ss.score>=best-40)
            {
                cc = k+") "+ss.name+" "+ss.surname+" - D"+"\n";
                bw.write(cc);


            }
            else
            {
                cc = k+") "+ss.name+" "+ss.surname+" - F"+"\n";
                bw.write(cc);


            }
            k++;

        }
        average = sum/k;
        String chara = "Average - "+average+"\n"+"Maximum - "+best+"\n"+"Minimum - "+min+"\n";


        bw.write(chara);
        bw.close();
        fw.close();










    }
}
