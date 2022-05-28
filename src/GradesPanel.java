import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GradesPanel  {  //extends JFrame implements ActionListener
    private ArrayList <Courses> courses = new ArrayList<Courses>();
    private static JFrame jf;
    private static JPanel jp;
    private static JButton jb;
    private static JLabel jl;

    public GradesPanel (ArrayList<Courses> courses)
    {
        this.courses = courses;
    }

    public GradesPanel ()
    {
    }

   /* public double getOverallAverage()
    {
        double sum = 0;
        int total = 0;
        for (int i = 0; i < courses.size(); i ++)
        {
            sum += courses.get(i).getAverage();
            total++;
        }
        return sum / total;
    } */

    public void addCourse(Courses c)
    {
        courses.add(c);
    }

    public ArrayList<Courses> getCourses()
    {
        return courses;
    }

    public ArrayList<String> getCoursesNames()
    {
        ArrayList<String> n = new ArrayList<String>();
        for (int i = 0; i < courses.size(); i++)
        {
            n.add(courses.get(i).getCourseName());
        }
        return n;
    }

    public void addStudent(Student s, String courseName)
    {
        for (int i = 0; i < courses.size(); i++)
        {
            if(courses.get(i).getCourseName().equals(courseName))
            {
                courses.get(i).addStudents(s);
            }
        }
    }

    public ArrayList<String> getStudentsNames()
    {
        ArrayList<String> n = new ArrayList<String>();
        for (int i = 0; i < courses.get(i).getStudents().size(); i++)
        {
            for (int z = 0; z < courses.get(z).getStudents().size(); z++)
            {
                n.add(courses.get(i).getStudents().get(z).getName());
            }
        }
        System.out.println(n);
        return n;
    }

    public void addAssignment(Assignments a, String studentName)
    {
        for (int i = 0; i < courses.get(i).getStudents().size(); i++)
        {
            if (courses.get(i).getStudents().get(i).getName().equals(studentName))
            {
                courses.get(i).getStudents().get(i).addAssignments(a);
            }
        }
    }

    //might add assignment and grade to students with the same name

    /* public int getStudentsSize(Student s, String courseName)
    {
        for (int i = 0; i < courses.size(); i++)
        {
            if (courses.get(i).getCourseName().contains(courseName))
            {
                return courses.get(i).getStudents().size();
            }
        }
        return 0;
    } */

    public static void startPanel()
    {
        jf = new JFrame("Grades Panel");
        jf.setVisible(true);
        jf.setSize(800,800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jp = new JPanel();
        jp.setBackground(Color.pink);
        jp.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jp.setLayout(new GridLayout(0,1));

        jb = new JButton("Courses");
        jl = new JLabel("Select Assignment");

        jp.add(jb);
        jp.add(jl);

        jf.add(jp, BorderLayout.CENTER);
    }
}
