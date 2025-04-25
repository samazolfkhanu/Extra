package Map;

import javax.swing.tree.TreeCellRenderer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int c;
        Map<Integer,Book> m=new TreeMap<>();
        do {
            System.out.println("1.Add Book\n2.Search by Name\n3.Show The BookList\n4.exit\n");
            c=s.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("enter book id:");
                    int id=s.nextInt();
                    s.nextLine();
                    System.out.println("enter title and author and published year:");
                    String title=s.nextLine();
                    String author=s.nextLine();
                    int year=s.nextInt();
                    try
                    {
                        m.put(id,new Book(title,author,year));
                    }
                    catch(InvalidInputException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    s.nextLine();
                    System.out.println("enter book name: ");
                    String name=s.nextLine();
                    for(Map.Entry<Integer,Book> map : m.entrySet())
                    {
                        if(map.getValue().getTitle().equals(name))
                            System.out.println("key: "+map.getKey()+"\n"+map.getValue().toString());
                        else
                            System.out.println("book with that name not found!");
                    }
                    break;

                case 3:
                    for(Map.Entry<Integer,Book> map: m.entrySet())
                    {
                        System.out.println("key: "+map.getKey()+"\n"+map.getValue().toString());
                    }
                    break;

                case 4:
                    System.out.println("Exit...!");
                    break;
            }
        }while(c!=4);
    }
}