package EX1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling
{
    private String filepath;
    public FileHandling(String path)
    {
        try
        {
            if(path!=null && !path.isEmpty())
                filepath=path;
            else
                throw new InvalidInputException("Invalid input!");
        }
        catch (InvalidInputException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void writeToFile(int[][] b)throws Exception
    {
        PrintWriter p=new PrintWriter(filepath);
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                p.print(b[i][j]);
                p.print("\t");
            }
            p.print("\n");
        }
        p.close();
    }

    public void readFromFile()throws Exception
    {
        Scanner s=new Scanner(new File(filepath));
        String l;
        int rows=0,i=0;
        while(s.hasNextLine())
        {
            s.nextLine();
            rows++;
        }
        String[] l1=new String[rows];
        int[][] b=new int[rows][rows];
        Scanner s1=new Scanner(new File(filepath));
        while(s1.hasNextLine())
        {
            l=s1.nextLine();
            l1=l.split("\t");
            for(int j=0;j<rows;j++)
            {
                b[i][j]=Integer.parseInt(l1[j]);
                System.out.print(b[i][j]+"\t");
            }
            System.out.print("\n");
             i++;
        }
    }
}
