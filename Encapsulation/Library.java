public class Library
{
    private String title;
    private String author;
    private boolean isBorrowed=false;

    public void setTitle(String title)
    {
        if(title!=null)
        {
            this.title=title;
        }
    }
    public void setAuthor(String author)
    {
        if(author!=null)
        {
            this.author=author;
        }
    }
    public String getTitle()
    {
        return title;
    }
    public void borroweding()
    {
        try
        {
            if(isBorrowed)
            {
                throw new BorrowedException("cant borrowed!");
            }
            else
                isBorrowed=true;
        }
        catch(BorrowedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void returning()
    {
        isBorrowed=false;
    }

    @Override
    public String toString()
    {
        return "Title: "+title+"\t"+"Author name: "+author+"\tis borroad? "+isBorrowed;
    }

}
