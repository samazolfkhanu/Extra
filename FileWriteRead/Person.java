package FileWriteRead;

import java.io.Serializable;

public class Person implements Serializable
{
    String name;
    public void setName(String name)
    {
        this.name=name;
    }
    @Override
    public String toString()
    {
        return "name: "+name;
    }
}
