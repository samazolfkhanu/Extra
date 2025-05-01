package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Library> a=new ArrayList<>();
        int c,cc,cd;
        Scanner s=new Scanner(System.in);
        do {
            System.out.println("1.add book\n2.change Information\n3.display info\n4.exit");
            c=s.nextInt();

            switch(c)
            {
                case 1:
                    System.out.println("enter number of book: ");
                    int num=s.nextInt();
                    s.nextLine();
                    for(int i=0;i<num;i++)
                    {
                        System.out.println("enter title and author and id and price: ");
                        String title=s.nextLine();
                        String author=s.nextLine();
                        String id=s.nextLine();
                        double price=s.nextDouble();
                        s.nextLine();
                        Library l=new Library(title,author,id,price);
                        a.add(l);
                    }
                    break;

                case 2:
                    s.nextLine();
                    Library l1=new Library();
                    System.out.println("enter book id: ");
                    String id=s.nextLine();
                    for(Library l:a)
                    {
                        try
                        {
                            if(l.getId().equals(id))
                            {
                                l1 = (Library) l.clone();
                                System.out.println("choose to change:\n1.title\n2.author\n3.id\n4.price\n5.exit");
                                do {
                                    cc = s.nextInt();
                                    s.nextLine();
                                    switch (cc) {
                                        case 1:
                                            System.out.println("enter Title");
                                            String ch=s.nextLine();
                                            l1.setTitle(ch);
                                            break;

                                        case 2:
                                            System.out.println("enter Author");
                                            String ch2=s.nextLine();
                                            l1.setAuthor(ch2);
                                            break;

                                        case 3:
                                            System.out.println("enter Id");
                                            String ch3=s.nextLine();
                                            l1.setId(ch3);
                                            break;

                                        case 4:
                                            System.out.println("enter Price: ");
                                            double ch4=s.nextDouble();
                                            l1.setPrice(ch4);
                                            break;

                                        case 5:
                                            System.out.println("exiting...!");
                                            break;
                                    }
                                    s.nextLine();
                                    System.out.println(l1);
                                    System.out.println("save the changes?(y/n)");
                                    String ans=s.nextLine();
                                    if(ans.equalsIgnoreCase("y")) {
                                        a.set(a.indexOf(l),l1);
                                        System.out.println("changes add succefully!");
                                        cc=5;
                                    }
                                    else
                                        break;
                                } while (cc != 5);
                                break;
                            }else
                                System.out.println("not found that book!");
                        }
                        catch(CloneNotSupportedException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 3:
                    System.out.println("1.display all\n2.search by Id\n3.exit");
                    cd=s.nextInt();
                    switch(cd)
                    {
                        case 1:
                            for(Library l:a)
                            {
                                System.out.println(l.toString());
                            }
                            break;

                        case 2:
                            s.nextLine();
                            System.out.println("enter Id: ");
                            String i=s.nextLine();
                            for(Library l:a)
                            {
                                if(i.equals(l.getId()))
                                {
                                    System.out.println(l);
                                    break;
                                }
                            }
                            break;

                        case 3:
                            System.out.println("exiting...!");

                    }
                    break;

                case 4:
                    System.out.println("exiting the code...!");
                    break;

            }
        }while(c!=4);
    }
}
