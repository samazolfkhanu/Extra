package Library;

import java.util.Objects;

public class Library implements Cloneable
{
    private String title;
    private String author;
    private String id;
    private double price;

    public Library(String title,String author,String id,double price)
    {
        if(title!=null && author!=null && id!=null && Integer.parseInt(id)>0 && price>0)
        {
            this.title=title;
            this.author=author;
            this.id=id;
            this.price=price;
        }
        else
            throw new NullPointerException("Some Fields are null!");
    }
    public Library()
    {

    }

    public void setId(String id)
    {
        if(id!=null && Integer.parseInt(id)>0)
            this.id = id;
        else
            throw new NullPointerException("Id is null!");
    }
    public String getId()
    {
        return id;
    }

    public void setAuthor(String author)
    {
        if(author!=null)
            this.author= author;
        else
            throw new NullPointerException("Author is null!");
    }
    public String getAuthor()
    {
        return author;
    }

    public void setTitle(String title) {
        if(title!=null)
            this.title=title;
        else
            throw new NullPointerException("Title is null!");
    }
    public String getTitle()
    {
        return title;
    }

    public void setPrice(double price)
    {
        if(price>0)
            this.price=price;
        else
            throw new NullPointerException("Title is null!");
    }
    public double getPrice()
    {
        return price;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(obj!=null && getClass()!=obj.getClass())
            return false;
        Library l=(Library) obj;
        return this.id.equals(l.id) && this.price==l.price && this.author.equals(l.author) && this.title.equals(l.title);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(title,author,id,price);
    }
    @Override
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
    @Override
    public String toString()
    {
        return ">>Title: "+title+"\nAuthor: "+author+"\nId: "+id+"\nPrice: "+price+"\n";
    }
}
