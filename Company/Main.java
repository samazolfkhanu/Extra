package Company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<FullTimeEmployee> a=new ArrayList<>();
        ArrayList<PartTimeEmployee> a1=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int c,c1;
        System.out.println("welcome to the site:"+"\n");
        do {
            System.out.println("1.add employee\n2.search by id\n3.display all employees\n4.exit\n");
            c=s.nextInt();
            s.nextLine();
            switch(c)
            {
                case 1:
                    do {
                        System.out.println("1.fulltime\n2.parttime\n3.exit\n");
                        c1=s.nextInt();
                        s.nextLine();
                        switch(c1)
                        {
                            case 1:
                                System.out.println("enter name and id and hours of work and department:");
                                String name=s.nextLine();
                                int d=s.nextInt();
                                int h=s.nextInt();
                                s.nextLine();
                                String dep=s.nextLine();
                                try
                                {
                                    FileHandle f=new FileHandle("F:/Practice/Company/FullTime.txt");
                                    FullTimeEmployee e=new FullTimeEmployee(name,d,h,Department.search(dep));
                                    f.writeToFile(e);
                                }catch(InvalidInputException e)
                                {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 2:
                                System.out.println("enter name and id and department:");
                                String n=s.nextLine();
                                int id=s.nextInt();
                                s.nextLine();
                                String deprt=s.nextLine();
                                try
                                {
                                    FileHandle f=new FileHandle("F:/Practice/Company/PartTime.txt");
                                    PartTimeEmployee e=new PartTimeEmployee(n,id,Department.search(deprt));
                                    f.writeToFile(e);
                                }catch(InvalidInputException e)
                                {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 3:
                                System.out.println("exiting...!");
                                break;

                        }
                    }while(c1!=3);

                case 2:
                    do {
                        System.out.println("1.fulltime\n2.parttime\n3.exit\n");
                        c1=s.nextInt();
                        s.nextLine();
                        switch(c1)
                        {
                            case 1:
                                try
                                {
                                    FileHandle f=new FileHandle("F:/Practice/Company/FullTime.txt");
                                    a=f.readFromFileF();
                                    System.out.println("enter id: ");
                                    int id=s.nextInt();
                                    for(FullTimeEmployee e: a)
                                    {
                                        if(e.getId()==id)
                                        {
                                            System.out.println(e.toString());
                                        }
                                    }
                                }
                                catch(InvalidInputException err)
                                {
                                    System.out.println(err.getMessage());
                                }
                                break;

                            case 2:
                                try
                                {
                                    FileHandle f=new FileHandle("F:/Practice/Company/PartTime.txt");
                                    a1=f.readFromFileP();
                                    System.out.println("enter id: ");
                                    int id=s.nextInt();
                                    s.nextLine();
                                    for(PartTimeEmployee e: a1)
                                    {
                                        if(e.getId()==id)
                                        {
                                            System.out.println(e.toString());
                                        }
                                    }
                                }
                                catch(InvalidInputException err)
                                {
                                    System.out.println(err.getMessage());
                                }
                                break;

                            case 3:
                                System.out.println("exiting...!");
                                break;
                        }
                    }while(c1!=3);

                case 3:
                    try
                    {
                        FileHandle f=new FileHandle("F:/Practice/Company/FullTime.txt");
                        a=f.readFromFileF();
                        FileHandle f1=new FileHandle("F:/Practice/Company/PartTime.txt");
                        a1=f1.readFromFileP();
                        for(FullTimeEmployee e:a)
                        {
                            System.out.println(e.toString());
                        }
                        for(PartTimeEmployee e1:a1)
                        {
                            System.out.println(e1.toString());
                        }
                    }
                    catch(InvalidInputException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("exiting ...!");
                    break;
            }
        }while(c!=4);
    }
}
