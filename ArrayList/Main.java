package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Main m=new Main();
        Scanner scan=new Scanner(System.in);
        ArrayList<Student> a=new ArrayList<>();
        Student[] s=new Student[4];
        for(int i=0;i<4;i++)
        {
            System.out.println("enter name and score: ");
            String name=scan.nextLine();
            int score=scan.nextInt();
            s[i]=new Student();
            try
            {
                s[i].setName(name);
                s[i].setScore(score);
            }
            catch(InvalidInputException e)
            {
                System.out.println(e.getMessage());
            }
            scan.nextLine();
            a.add(s[i]);
        }
        ArrayList<Student> a2=new ArrayList<>();
        for(int i=0;i<s.length;i++) {
            a2.add(new Student(s[i].getName(),s[i].getScore()));
        }
        ArrayList<Student> a1=new ArrayList<>(a);
        try
        {
            a1.get(0).setName("nana");
            a1.get(0).setScore(90);
        }
        catch(InvalidInputException e)
        {
            System.out.println(e.getMessage());
        }
        for(Student g:a1)
        {
            m.printinfo(g);
        }
        for(Student f:a2)
        {
            m.printinfo(f);
        }
    }
    public void printinfo(Student s)
    {
        System.out.println(s.toString());
    }
}
