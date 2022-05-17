import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

import java.util.*;

public class GradesPanel {
    private ArrayList <Courses> courses;

    public GradesPanel (ArrayList<Courses> courses)
    {
        this.courses = courses; 
    }

    public double getOverallAverage()
    {
        double sum = 0;
        int total = 0;
        for (int i = 0; i < courses.size(); i ++)
        {
            sum += courses.get(i).getAverage();
            total++;
        }
        return sum / total;
    }
}
