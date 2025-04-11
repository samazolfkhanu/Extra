package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String name;
        long id;
        Scanner s=new Scanner(System.in);
        Employee[] e=new Employee[3];


        System.out.println("enter name id:");
        name=s.nextLine();
        id=s.nextLong();
        s.nextLine();
        e[0]=new FullTime(name,id);
        System.out.println(e[0].toString());


        System.out.println("enter name id and hours:");
        name=s.nextLine();
        id=s.nextLong();
        int h=s.nextInt();
        s.nextLine();
        e[1]=new PartTime(h,name,id);
        System.out.println(e[1].toString());


        System.out.println("enter name id and number of projects:");
        name=s.nextLine();
        id=s.nextLong();
        int num=s.nextInt();
        s.nextLine();
        e[2]=new Constract(num,name,id);
        System.out.println(e[2].toString());
    }
}
