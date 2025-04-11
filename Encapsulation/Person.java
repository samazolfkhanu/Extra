public class Person
{
    private String name;
    private int age;

    public void setName(String name)
    {
        if(name!=null)
        {
            this.name=name;
        }
    }
    public String getName()
    {
        return name;
    }


    public void setAge(int age)
    {
        if(age>0)
        {
            this.age=age;
        }
    }
    public int getAge()
    {
        return age;
    }


    @Override
    public String toString()
    {
        return "Name: "+name+"\t"+"age: "+age;
    }
}
