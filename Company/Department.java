package Company;

enum Department
{
    IT,DESIGN,HR;

    public static Department search(String m)
    {
        for(Department d:Department.values())
        {
            if(d.name().equalsIgnoreCase(m))
                return d;
        }
        return null;
    }
}
