package Company;


import java.io.*;
import java.util.ArrayList;
import java.util.EventObject;

public class FileHandle {
    protected String filePath;
    private File f;

    public FileHandle(String fP) throws InvalidInputException {
        if (fP != null) {
            filePath = fP;
            f = new File(filePath);
        } else
            throw new InvalidInputException("Invalid input!");
    }

    public void writeToFile(Employee e) {
        try {
            ObjectOutputStream o;
            if (f.length() == 0) {
                o = new ObjectOutputStream(new FileOutputStream(filePath));
                o.writeObject(e);
            } else {
                o = new Append(new FileOutputStream(filePath, true));
                o.writeObject(e);
            }
            o.close();
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

    public ArrayList<FullTimeEmployee> readFromFileF() {
        ArrayList<FullTimeEmployee> e = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(filePath));
            while (true) {
                try
                {
                    Employee em = (Employee) o.readObject();
                    if (em instanceof FullTimeEmployee)
                        e.add((FullTimeEmployee) em);
                }
                catch(EOFException er)
                {
                    break;
                }
            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        return e;
    }

    public ArrayList<PartTimeEmployee> readFromFileP()
    {
        ArrayList<PartTimeEmployee> e=new ArrayList<>();
        try
        {
            ObjectInputStream o=new ObjectInputStream(new FileInputStream(filePath));
            while(true)
            {
                try
                {
                    Employee em = (Employee) o.readObject();
                    if (em instanceof FullTimeEmployee)
                        e.add((PartTimeEmployee) em);
                }
                catch(EOFException er)
                {
                    break;
                }
            }
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
        }
        return e;
    }
}

