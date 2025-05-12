package GenericProject;

public class Order <T extends MenueItem>
{
    T item;
    public Order(T item)
    {
        if(item!=null)
            this.item=item;
        else
            throw new NullPointerException("Invalid Input!");
    }
    public double getTotalPrice()
    {
        return item.getPrice();
    }
    public String printOrder()
    {
        return item.toString();
    }
}
