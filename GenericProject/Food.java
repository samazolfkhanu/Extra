package GenericProject;
public class Food implements MenueItem
{
    private String name;
    private double price;

    public void addFood(String name,double price) {
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
                +"Food: "+name +"\t"+price+"$"
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
