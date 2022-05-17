import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Assignments {

    //Assignments per course
    //Teacher can add, delete, or change assignment grade, name, or percent worth

    private String assignmentName;
    private String category;
    private double grade;
    //private int categoryPercent;

    public Assignments(String assignmentName, String category, int grade) {
        this.assignmentName = assignmentName;
        this.category = category;
        this.grade = grade;
        //this.categoryPercent = categoryPercent;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public String getCategory() {
        return category;
    }

    public double getGrade() {
        return grade;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


}
