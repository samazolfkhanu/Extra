package Company;

import ArrayList.InvalidInputException;

public class FullTimeEmployee extends Employee implements Benefit
{
    private int h;
    public FullTimeEmployee(String name,int id,int h,Department d) throws InvalidInputException
    {
        super(name,id,d);
        if(h>0)
            this.h=h;
        else throw new InvalidInputException("invalid input!");
    }

    public void setH(int h)throws InvalidInputException
    {
        if(h>0)
            this.h=h;
        else
            throw new InvalidInputException("Invalid Input!");
    }
    public int getH()
    {
        return h;
    }

    @Override
    public void calculateSalary()
    {
        try
        {
            setSalary(100000);
        }
        catch(InvalidInputException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getBenefits()
    {
        try
        {
            setSalary(getSalary()+(h*30));
        }
        catch(InvalidInputException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString()
    {
        return "name: "+getName()+"\tid: "+getId()+"\tsalary: "+getSalary()+"\tdeprtment: "+getD();
    }
}
