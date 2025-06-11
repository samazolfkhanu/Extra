package Thread1;

public class ThreadState implements Runnable
{
    public void run()
    {

        try
        {
            System.out.println("Waked Up!");
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
