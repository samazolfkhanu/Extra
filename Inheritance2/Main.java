package Inheritance2;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Animal> a=new ArrayList<>();
        a.add(new Cat());
        a.add(new Cat());
        a.add(new Dog());
        for(Animal d:a)
        {
            d.makeSound();
        }
    }
}
