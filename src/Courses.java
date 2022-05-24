import java.util.*;

public class Courses {
    private String courseName;
    private ArrayList <Student> students;

    public Courses (ArrayList<Student> students, String courseName)
    {
        this.courseName = courseName;
        this.students = students;
    }

    public Courses ()
    {
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    /* public double getAverage() {
         int sum = 0;
         int total = 0;
        for (int i = 0; i < students.size(); i++)
        {
            sum += students.get(i).getAssignments().get(i).getGrade();
            total++;
        }
        return (double) sum / total;
    } */

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}

//improvement: track the date of when the assignment gets added