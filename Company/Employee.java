package Company;


import java.io.Serializable;

abstract public class Employee implements Serializable
{
    private int id;
    private String name;
    private long salary;
    private Department d;
    public Employee(String name,int id,Department d) throws InvalidInputException
    {
        if(name!=null && id>0)
        {
            this.name=name;
            this.id=id;
            this.d=d;
        }
        else
            throw new InvalidInputException("Invalid Input!");
    }

    public void setName(String name) throws InvalidInputException
    {
        if(name!=null)
            this.name=name;
        else
            throw new InvalidInputException("invalid input");
    }

    public void setId(int id) throws InvalidInputException
    {
        if(id>0)
            this.id=id;
        else
            throw new InvalidInputException("invalid input");
    }
    public void setSalary(long salary)throws InvalidInputException
    {
        if(salary>0)
            this.salary=salary;
        else throw new InvalidInputException("Invalid input!");
    }

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public long getSalary()
    {
        return salary;
    }
    public String getD()
    {
        return d.name();
    }

    abstract public void calculateSalary();

    @Override
    public String toString()
    {
        return "name: "+name+"\tid: "+id+"\tsalary: "+salary+"\tdeprtment: "+d.name();
    }
}
