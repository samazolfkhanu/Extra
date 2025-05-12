package GenericProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OrderManager
{
    private long id;
    private long currentId=1;
    Map<Long,Order> m;
    public OrderManager()
    {
        m=new HashMap<>();
    }
    public void addOrder(Order order)
    {
        id=currentId++;
        if(order!=null)
            m.put(id,order);
        else
            throw new NullPointerException("Invalid Inpute!");

    }
    public void removeOrder(Long id)
    {
        for(Map.Entry<Long,Order> map:m.entrySet())
        {
            if(map.getKey()==id)
                m.remove(map.getKey());
        }
    }
    public Map getAllOrders()
    {
        return m;
    }
    public void findOrder(Long id)
    {
        Iterator<Map.Entry<Long,Order>> it=m.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Long,Order> m=it.next();
            if(m.getKey()==id)
                System.out.println(m.getValue().printOrder());
        }
    }
}