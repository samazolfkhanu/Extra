package Map;

import java.util.Objects;

public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private int year;

    public Book(String title,String author,int year)throws InvalidInputException
    {
        if(title!=null && author!=null && year>0)
        {
            this.title=title;
            this.author=author;
            this.year=year;
        }
        else
            throw new InvalidInputException("Invalid Input!");
    }


    public void setTitle(String title)throws InvalidInputException
    {
        if(title!=null)
            this.title=title;
        else
            throw new InvalidInputException("Invalid Input!");
    }
    public void setAuthor(String author)throws InvalidInputException
    {
        if(author!=null)
            this.author=author;
        else
            throw new InvalidInputException("Invalid Input!");
    }
    public void setYear(int year)throws InvalidInputException
    {
        if(year>0)
            this.year=year;
        else
            throw new InvalidInputException("Invalid Input!");
    }


    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getYear()
    {
        return year;
    }


    @Override
    public int compareTo(Book b)
    {
        int r=Integer.compare(this.year,b.year);
        if(r!=0)
            return r;
        r=this.title.compareTo(b.title);
        if(r!=0)
            return r;
        return r=this.author.compareTo(b.author);
    }


    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(obj!=null || getClass()!=obj.getClass())
            return false;
        Book b=(Book) obj;
        return this.year==b.year && this.author.equals(b.author) && this.title.equals(b.author);
    }


    @Override
    public int hashCode()
    {
        return Objects.hash(title,year,author);
    }

    @Override
    public String toString()
    {
        return ">>Title: "+title+"\tAuthor: "+author+"\tPublished year: "+year;
    }
}