package InnerClass;

public class Main
{
    public static void main(String[] args)
    {
        Employee e=new Employee("sama",3);
        Employee.Address a=e.new Address("NewYork");
        System.out.println(e.toString()+"\n"+a.toString());
    }
}
