import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GradesPanelRunner {
    public static void main(String[] args) {
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

        // if the file doesn't exist, we will create a blank Person object and ask them for a name and hobby
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
    }

}

//something to work on can be tracking duplicate usernames
//add requirements for a safer password
