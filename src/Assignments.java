import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Assignments {

    //Assignments per course
    //Teacher can add, delete, or change assignment grade, name, or percent worth

    private String assignmentName;
    private String category;
    private int categoryPercent;
    private double grade;

    public Assignments(String assignmentName, String category, int categoryPercent) {
        this.assignmentName = assignmentName;
        this.category = category;
        this.categoryPercent = categoryPercent;
    }

    //public void

}
