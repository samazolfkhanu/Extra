package Thread1;

public class Main
{
    public static void main(String[] args)
    {
        Thread t=new Thread(new Run());
        Thread t1=new Thread(new Run());
        t.start();
        t1.start();
    }
}
