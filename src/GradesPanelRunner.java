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
        //GradesPanel gp = new GradesPanel();
        Courses c = new Courses();

        try {
            File f = new File("src/logininfo.txt");
            Scanner s = new Scanner(f);
            int line = 1;
            String user = "";
            String pass = "";
            // reading from the file line by line
            while (s.hasNextLine()) { //while (s.hasNext())
                String data = s.next();
                if (line == 1) {
                    //user = data;
                    p.setUsername(data);
                }
                if (line == 2) {
                    //pass = data;
                    p.setPassword(data);
                }
                line++;
            }
            //p.save();
            s.close();
        }
        // if the file doesn't exist, ask user to create a new account
        catch (FileNotFoundException e) {
            //LoginInfo p = new LoginInfo();
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
                    c.setCourseName(courseName);
                }
                else if (choice.equalsIgnoreCase("S"))
                {

                }
                choice = x.nextLine();
            }
            //gp.startPanel();
        }





    }

    public static void verifyLogin(String username, String password, String filepath)
    {
        // filepath is "src/logininfo.txt" or "logininfo.data"
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

                //System.out.println(tempUser + ": " + tempPass);

                if(tempUser.trim().equals(username.trim()) && tempPass.trim().equals(password.trim())) //l.getUsername().trim(), l.getPassword().trim()
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
                System.out.println("Welcome " + username + "!");
            }

        }
        catch (Exception e)
        {
           // System.out.println(e);
            System.out.println("Incorrect Login");
        }
    }

}

//something to work on can be tracking duplicate usernames
//add requirements for a safer password
//allow user to create new username and password
