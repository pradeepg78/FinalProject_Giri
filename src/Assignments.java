public class Assignments {

    //Assignments per course
    //Teacher can add, delete, or change assignment grade, name, or percent worth

    private String assignmentName;
    private double grade;

    public Assignments(String assignmentName, double grade) {
        this.assignmentName = assignmentName;
        this.grade = grade;
    }

    public String getAssignmentName()
    {
        return assignmentName;
    }

    public double getGrade()
    {
        return grade;
    }

    public void setAssignmentName(String assignmentName)
    {
        this.assignmentName = assignmentName;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }


}
