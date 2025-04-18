package FileWriteRead;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        File f=new File("F:/Practice/FileWriteRead/z.txt");
        Person p=new Person();
        p.setName("sama");
        try
        {
            ObjectInputStream o=new ObjectInputStream(new FileInputStream("F:/Practice/FileWriteRead/z.txt"));
            Person P1=(Person) o.readObject();
            System.out.println(p.toString());
            o.close();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
class AppendObj extends ObjectOutputStream
{
    public AppendObj(OutputStream out) throws IOException
    {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException
    {
        reset();
    }
}
