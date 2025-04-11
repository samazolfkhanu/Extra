package EX1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int k,c;
        Matrix m=new Matrix();
        FileHandling f=new FileHandling("F:/Neo/n.txt");
        do {
            System.out.println("\n1.initializing\n2.write to file\n3.read from file\n4.exit\n");
            c=s.nextInt();
            s.hasNextLine();
            switch(c)
            {
                case 1:
                    System.out.println("enter k:");
                    k=s.nextInt();
                    m.setK(k);
                    break;

                case 2:
                    try
                    {
                        f.writeToFile(m.getB());
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try
                    {
                        f.readFromFile();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("exiting...");
                    break;

            }
        }while(c!=4);

    }

    public static class Matrix
    {
        private int k;
        private int[][] b;
        public Matrix()
        {

        }
        public void initializing()
        {
            b=new int[k][k];
            Scanner s=new Scanner(System.in);
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<k;j++)
                {
                    System.out.println("enter b["+i+"]"+"["+j+"]");
                    b[i][j]=s.nextInt();
                }
            }
            for(int i=0;i<b.length;i++)
            {
                for(int j=0;j<b.length;j++)
                {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.print("\n");
            }
        }
        public void setK(int k)
        {
            try
            {
                if(k>0)
                {
                    this.k = k;
                    initializing();
                }
                else
                    throw new InvalidInputException("Invalid input!");
            }
            catch(InvalidInputException e)
            {
                System.out.println(e.getMessage());
            }
        }

        public int getK()
        {
            return k;
        }
        public int[][] getB()
        {
            return b;
        }

    }
}
