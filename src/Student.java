import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Assignments> assignments;

    public Student(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Assignments> getAssignments()
    {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignments> assignments)
    {
        this.assignments = assignments;
    }

    public void addAssignments(Assignments a)
    {
        assignments.add(a);
    }

    public double getAverage() {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < assignments.size(); i++)
        {
            sum += assignments.get(i).getGrade();
            total++;
        }
        return (double) sum / total;
    }

}
