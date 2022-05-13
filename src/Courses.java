public class Courses {
    private String courseName;
    private int percentMakeup;
    private int extraCredit;
    private boolean isHonorRoll;
    private int grade;

    public Courses (String courseName, int percentMakeup)
    {
        this.courseName = courseName;
        this.percentMakeup = percentMakeup;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getPercentMakeup() {
        return percentMakeup;
    }

    public int getExtraCredit() {
        return extraCredit;
    }

    public boolean isHonorRoll() {
        return isHonorRoll;
    }

    public int getGrade() {
        return grade;
    }







}
