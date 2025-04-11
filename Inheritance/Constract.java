package Inheritance;

public class Constract extends Employee
{
    private int num;
    public Constract(int num,String name,long id)
    {
        super(name,id);
        try
        {
            this.setNum(num);
        }
        catch(InvalidInputeException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void setNum(int num)throws InvalidInputeException
    {
        if(num>=0)
        {
            this.num=num;
            calculateSalary();
        }
        else
            throw new InvalidInputeException("invalid input!");
    }

    @Override
    public void calculateSalary()
    {
        try
        {
            this.setSalary(10000*num);
        }
        catch(InvalidInputeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
