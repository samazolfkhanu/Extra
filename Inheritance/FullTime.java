package Inheritance;

public class FullTime extends Employee
{
    public FullTime(String name,long id)
    {
        super(name,id);
    }
    @Override
    public void calculateSalary()
    {
        try
        {
            this.setSalary(120000);
        }
        catch(InvalidInputeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
