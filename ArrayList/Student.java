package ArrayList;

public class Student
{
    private String name;
    private int score;
    public Student(String name,int score)
    {
        try
        {
            setName(name);
            setScore(score);
        }
        catch(InvalidInputException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public Student()
    {

    }

    public void setName(String name) throws InvalidInputException
    {
        if(name!=null)
            this.name=name;
        else
            throw new InvalidInputException("invalid input!");
    }

    public void setScore(int score) throws InvalidInputException
    {
        if(score>0)
            this.score=score;
        else
            throw new InvalidInputException("invalid input!");
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    @Override
    public String toString()
    {
        return "Name: "+name+"Score: "+score;
    }
}
