import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class GradesPanelRunner {
    private JFrame jf;
    private JPanel jp;
    private JButton jb;
    private JLabel jl;
    private static Scanner s;

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        LoginInfo p = new LoginInfo();

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
        verifyLogin(us, pa, "src/logininfo.txt", p);

        //find out how to access login info p after a user and pass is created from the catch block - COMPLETE

    }

    public static void verifyLogin(String username, String password, String filepath, LoginInfo l)
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

                if(tempUser.trim().equals(l.getUsername().trim()) && tempPass.trim().equals(l.getPassword().trim()))
                {
                    found = true;
                }
            }
            s.close();
            System.out.println(found);
        }
        catch (Exception e)
        {
           // System.out.println(e);
            System.out.println("error");
        }
    }

}

//something to work on can be tracking duplicate usernames
//add requirements for a safer password
//allow user to create new username and password
