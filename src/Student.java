import java.util.ArrayList;

public class Student {
    private String name;
    private int gradeLevel;
    private ArrayList<Assignments> assignments;

    public Student(String name, int gradeLevel)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel)
    {
        this.gradeLevel = gradeLevel;
    }

    public ArrayList<Assignments> getAssignments()
    {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignments> assignments)
    {
        this.assignments = assignments;
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
