package Thread1;

public class Main
{
    public static void main(String[] args)
    {
        MyThread m=new MyThread();
        MyThread m1=new MyThread();
        m.start();
        m1.start();
    }
}
