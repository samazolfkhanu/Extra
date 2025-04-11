package Inheritance;

abstract public class Employee
{
    private String name;
    private long id;
    private long salary;

    public Employee(String name,long id)
    {
        try
        {
            this.setName(name);
            this.setId(id);
        }
        catch(InvalidInputeException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void setName(String name)throws InvalidInputeException
    {
        if(name!=null)
        {
            this.name=name;
        }
        else
            throw new InvalidInputeException("invalid Input!");
    }
    public void setId(long id)throws InvalidInputeException
    {
        if(id>0)
        {
            this.id=id;
        }
        else
            throw new InvalidInputeException("invalid Input!");
    }
    public void setSalary(long salary)throws InvalidInputeException
    {
        if(salary>0)
        {
            this.salary=salary;
        }
        else
            throw new InvalidInputeException("invalid Input!");
    }
    public String getName()
    {
        return name;
    }
    public long getId()
    {
        return id;
    }
    public long getSalary()
    {
        return salary;
    }
    abstract void calculateSalary();

    @Override
    public String toString()
    {
        return "name: "+getName()+"\tid: "+getId()+"\tsalary: "+getSalary();
    }

}
