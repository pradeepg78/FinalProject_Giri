import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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

        try {
            File f = new File("src/logininfo.data");
            Scanner s = new Scanner(f);
            int line = 1;
            String user = "";
            String pass = "";
            // reading from the file line by line
            while (s.hasNextLine()) {
                String data = s.nextLine();
                if (line == 1) {
                    user = data;
                }
                if (line == 2) {
                    pass = data;
                }
                line++;
            }
            s.close();
        }
        // if the file doesn't exist, ask user to create a new account
        catch (FileNotFoundException e) {
            LoginInfo p = new LoginInfo();
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
        verifyLogin(us, pa, "logininfo.txt");

        //find out how to access login info p after a user and pass is created from the catch block

    }

    public static void verifyLogin(String username, String password, String filepath, LoginInfo l)
    {
        // filepath is "logininfo.txt"
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

                if(tempUser.trim().equals(l.getUsername().trim()) && tempPass.trim().equals(l.getPassword().trim()))
                {
                    found = true;
                }
            }
            s.close();
        }
        catch (Exception e)
        {

        }
    }

}

//something to work on can be tracking duplicate usernames
//add requirements for a safer password
