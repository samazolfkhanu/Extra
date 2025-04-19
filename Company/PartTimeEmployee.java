package Company;


import java.io.Serializable;

public class PartTimeEmployee extends Employee implements Serializable
{
    public PartTimeEmployee(String name,int id,Department d) throws InvalidInputException
    {
        super(name,id,d);
        calculateSalary();
    }

    @Override
    public void calculateSalary()
    {
        try
        {
            setSalary(50000);
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
