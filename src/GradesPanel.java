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

    //**************************NEED TO CREATE STUDENTS**********************************************

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
