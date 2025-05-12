package GenericProject;

import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        OrderManager p=new OrderManager();
        int c,c1;
        do {
            System.out.println("1.add order\n2.remove order\n3.show all orders\n");
            c=s.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("1.Food\n2.Drink\n");
                    c=s.nextInt();
                    switch(c)
                    {
                        case 1:
                            s.nextLine();
                            System.out.println("enter name and price: ");
                            String name=s.nextLine();
                            double price=s.nextDouble();
                            s.nextLine();
                            Food f=new Food();
                            f.addFood(name,price);
                            p.addOrder(new Order(f));
                            break;
                        case 2:
                            s.nextLine();
                            System.out.println("enter name and price: ");
                            String n=s.nextLine();
                            double pr=s.nextDouble();
                            s.nextLine();
                            Drink d=new Drink();
                            d.addDrink(n,pr);
                            p.addOrder((new Order(d)));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("enter order id:");
                    long id=s.nextLong();
                    p.removeOrder(id);
                    break;
                case 3:
                    Map<Long,Order> m=p.getAllOrders();
                    for(Map.Entry<Long , Order> map:m.entrySet())
                    {
                        System.out.println(map.getValue().printOrder());
                    }
                    break;
            }
        }while(c!=4);
    }
}
