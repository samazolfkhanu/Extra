package Enum;

import EX1.InvalidInputException;

import java.util.ArrayList;

public enum Student
{
    CE(new Project("make a chatbot"),new Lessons("math","english","java"));

    private final Project pN;
    private  final Lessons lN;
    Student(Project project,Lessons l)
    {
        pN=project;
        lN=l;
    }
    public Project getpN() {
        return pN;
    }
    @Override
    public String toString()
    {
        return lN.toString();
    }

    public static class Project
    {
        private String des;
        public Project(String m)
        {
            des=m;
        }
        public String getDes()
        {
            return des;
        }
    }

    public static class Lessons
    {
        private final ArrayList<String> l =new ArrayList<>();
        public Lessons(String l1,String l2,String l3)
        {
            l.add(l1);
            l.add(l2);
            l.add(l3);
        }

        public String toString()
        {
            return l.toString();
        }
    }

    public static Student search(String name)
    {
        for(Student s:Student.values())
        {
            if(s.name().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
}