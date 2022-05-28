import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class GradesPanelRunner {
   /* private JFrame jf;
    private JPanel jp;
    private JButton jb;
    private JLabel jl; */
    private static boolean correctLogin;
    private static Scanner s;

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        LoginInfo p = new LoginInfo();
        GradesPanel gp = new GradesPanel();
        Courses c = new Courses();
        Save sa = new Save();

        try {
            File f = new File("src/logininfo.txt");
            Scanner s = new Scanner(f);
            int line = 1;
            while (s.hasNextLine()) {
                String data = s.next();
                if (line == 1) {
                    p.setUsername(data);
                }
                if (line == 2) {
                    p.setPassword(data);
                }
                line++;
            }
            s.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Please create a new account below. ");
            System.out.print("Enter a username: ");
            Scanner in = new Scanner(System.in);
            String user = in.nextLine();
            System.out.print("Enter a password: ");
            String pass = in.nextLine();
            p.setUsername(user);
            p.setPassword(pass);
            p.save();
        }

        System.out.print("Please enter your username: ");
        String us = x.nextLine();
        System.out.print("Please enter your password: ");
        String pa = x.nextLine();
        verifyLogin(us, pa, "src/logininfo.txt");

        if (correctLogin)
        {
            System.out.println("What would you like to do today?");
            System.out.println("Add (C)ourse");
            System.out.println("Add (S)tudent");
            System.out.println("Add (A)ssignment");
            System.out.println("(Q)uit");
            String choice = x.nextLine();
            while (!choice.equalsIgnoreCase("Q"))
            {
                if (choice.equalsIgnoreCase("C"))
                {
                    System.out.print("Please enter a course name: ");
                    String courseName = x.nextLine();

                    if (gp.getCourses().size() == 0)
                    {
                        c.setCourseName(courseName);
                        gp.addCourse(c);
                        System.out.println("Made it 1"); //DELETE THIS
                    }
                    else
                    {
                        System.out.println("Made it 2"); // DELETE THIS

                        if (gp.getCoursesNames().contains(courseName))
                        {
                            System.out.println("ERROR: This course already exists");
                        }
                        else
                        {
                            Courses toAdd = new Courses();
                            toAdd.setCourseName(courseName);
                            gp.addCourse(toAdd);
                            System.out.println("Course Successfully Added");
                        }


                    }
                    System.out.println();
                    System.out.print("Course List: ");
                    for (int i = 0; i < gp.getCourses().size(); i++)
                    {
                        System.out.print(gp.getCourses().get(i).getCourseName() + " -- ");
                    }

                }
                else if (choice.equalsIgnoreCase("S"))
                {
                    System.out.print("Please enter the student's name: ");
                    String name = x.nextLine();
                    System.out.print("Which course would you like to add this student to?: ");
                    String courseName = x.nextLine();

                    //Student s = null;

                    if (!gp.getCoursesNames().contains(courseName))
                    {
                        System.out.println("ERROR: This course does not exist");
                    }
                    else
                    {
                        Student s = new Student(name);  //s = new Student(name);
                        gp.addStudent(s, courseName);
                        System.out.println("Student Successfully Added.");

                    }
/*
                    System.out.println();
                    System.out.println("Course List");
                    for (int i = 0; i < gp.getStudentsSize(s, courseName); i++)
                    {
                        System.out.println(gp.getCourses().get(i).getCourseName());
                        if (gp.getStudentsSize(s, courseName) <= gp.getCourses().size())
                        {
                            System.out.print(gp.getCourses().get(i).getStudents().get(i).getName());
                        }

                        if (gp.getCourses().get(i).getStudents().get(i).getName() != null)
                        {
                            System.out.print(gp.getCourses().get(i).getStudents().get(i).getName());
                        }

                    } */

                    /*
                    for (int i = 0; i < gp.getCourses().size(); i++)
                    {

                        if (!gp.getCourses().get(i).getCourseName().equals(courseToBeAddedIntoS)) //change this logic
                        {
                            exist = false;
                            if (exist == false)
                            {
                                System.out.println("ERROR: This course does not exist");
                                break;
                            }
                        }
                        System.out.println("Course Successfully Added");
                    } */

                }
                else if(choice.equalsIgnoreCase("A"))
                {
                    System.out.print("Which course would you like to add this assignment to?: ");
                    String courseToBeAddedIntoA = x.nextLine();


                }
                else
                {
                    System.out.println("ERROR: Invalid choice. ");
                }
                //sa.save(gp);
                choice = x.nextLine();
            }
            sa.save(gp);
        }
    }

    public static void verifyLogin(String username, String password, String filepath)
    {
        boolean found = false;
        String tempUser = "";
        String tempPass = "";

        try
        {
            s = new Scanner (new File(filepath));
            s.useDelimiter("[\n]");

            while (s.hasNextLine() && !found)
            {
                tempUser = s.next();
                tempPass = s.next();

                if(tempUser.trim().equals(username.trim()) && tempPass.trim().equals(password.trim()))
                {
                    found = true;
                    correctLogin = true;
                }
            }
            s.close();

            if (!found)
            {
                System.out.println("Incorrect Login Info.");
                correctLogin = false;
            }
            else
            {
                System.out.println();
                System.out.println("Welcome " + username + "!");
            }
        }
        catch (Exception e)
        {
            System.out.println("Incorrect Login");
        }
    }

}

//something to work on can be tracking duplicate usernames
//add requirements for a safer password
//allow user to create new username and password


//might have to access courses from GradesPanel instead of the variable c
//not sure about this yet, but will do more testing
