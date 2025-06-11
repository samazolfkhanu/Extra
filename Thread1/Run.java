package Thread1;

public class Run implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}
