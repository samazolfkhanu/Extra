package InnerClass;

public class Employee
{
    private String name;
    private int id;
    public Employee(String name,int id)
    {
        if(name!=null && id>0)
        {
            this.name=name;
            this.id=id;
        }
        else
            throw new IllegalArgumentException("Illegal Input!");
    }

    public class Address
    {
        private String city;

        public Address(String city)
        {
            if(city!=null)
                this.city=city;
            else
                throw new NullPointerException("City can not be Null!");
        }

        public String toString()
        {
            return "City: "+city;
        }
    }

    public String toString()
    {
        return "Name: "+name+"\nid: "+id;
    }
}
