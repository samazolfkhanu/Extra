package GenericProject;

import java.util.HashMap;
import java.util.Map;

public class Drink implements MenueItem
{
    private String name;
    private double price;

    public void addDrink(String name,double price) {
        if (name != null)
            this.name = name;
        else
            throw new NullPointerException("Invalid Input!");
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Invalid Input!");

    }
    @Override
    public String toString()
    {
        return "["
                +"Drink: "+name +"\t"+price+"$"
                +"]";
    }
    public double getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }

}
