package Inheritance;

public class PartTime extends Employee
{
    private int h;
    public PartTime(int h,String name,long id)
    {
        super(name,id);
        try
        {
            setTime(h);
        }
        catch(InvalidInputeException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void setTime(int h) throws InvalidInputeException
    {
        if(h>=0)
        {
            this.h=h;
            calculateSalary();
        }
        else
            throw new InvalidInputeException("Invalid input!");
    }

    @Override
    public void calculateSalary()
    {
        try
        {
            this.setSalary(h*2000);
        }
        catch(InvalidInputeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
