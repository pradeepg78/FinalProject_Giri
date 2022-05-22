import java.util.*;

public class Courses {
    private String courseName;
    //private int percentMakeup;
    private ArrayList <Assignments> assignmentsArrayList;

    //improvement: track the date of when the assignment gets added

    public Courses (ArrayList<Assignments> assignmentsArrayList, String courseName)
    {
        this.courseName = courseName;
        this.assignmentsArrayList = assignmentsArrayList;
    }

    public Courses ()
    {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

     public double getAverage() {
         int sum = 0;
         int total = 0;
        for (int i = 0; i < assignmentsArrayList.size(); i++)
        {
            sum += assignmentsArrayList.get(i).getGrade();
            total++;
        }
        return (double) sum / total;
    }

}
