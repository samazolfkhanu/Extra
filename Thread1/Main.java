package Thread1;

public class Main
{
    public static void main(String[] args)
    {
        Thread t=new Thread(new ThreadState());
        System.out.println(t.getState());
        t.start();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(t.getState());
        try
        {
            t.join();
        }catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(t.getState());

    }
}

