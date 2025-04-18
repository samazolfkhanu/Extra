package Company;

enum Department
{
    IT,DESIGN,HR

    public Department search(String m)
    {
        for(Department d:Department.values())
        {
            if(d.name().equalsIgnoreCase(m))
                return d;
        }
        return null;
    }
}
