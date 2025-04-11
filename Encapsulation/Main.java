import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int c,c1;
        String title,author;
        System.out.println("enter number of book: ");
        int num=s.nextInt();
        Library[] l=new Library[num];
        int i=0;
        boolean found;
        do {
            System.out.println("1.add book\n2.show Info\n3.borrowing\n4.return book\n5.exit\n");
            c=s.nextInt();
            switch(c)
            {
                case 1:
                    if(i<num)
                    {
                        l[i]=new Library();
                        System.out.println("enter title: ");
                        s.nextLine();
                        title=s.nextLine();
                        System.out.println("enter author: ");
                        author=s.nextLine();
                        l[i].setTitle(title);
                        l[i].setAuthor(author);
                        i++;
                    }
                    break;

                case 2:
                    System.out.println("enter book name: ");
                    s.nextLine();
                    String name=s.nextLine();
                    found=false;
                    for(Library l1:l )
                    {
                        if(name.equals(l1.getTitle()))
                        {
                            System.out.println(l1.toString());
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("book not found!");
                    break;

                case 3:
                    System.out.println("enter book name: ");
                    s.nextLine();
                    String n=s.nextLine();
                    found=false;
                    for(Library l1:l)
                    {
                        if(n.equals(l1.getTitle()))
                        {
                            l1.borroweding();
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("book not found!");
                    break;

                case 4:
                    System.out.println("enter book name: ");
                    s.nextLine();
                    String t=s.nextLine();
                    found=false;
                    for(Library l1:l)
                    {
                        if(t.equals(l1.getTitle()))
                        {
                            l1.returning();
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("book not found!");
                    break;

            }
        }while(c!=5);
    }
}