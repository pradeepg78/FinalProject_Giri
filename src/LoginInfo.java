import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class LoginInfo {
    private String username;
    private String password;
    //private static Scanner s;


    public LoginInfo()
    {
        username = "";
        password = "";
    }

    public LoginInfo(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public void save() {
        try {
            File f = new File("src/logininfo.txt");
            f.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/logininfo.txt");
            fw.write(username + "\n"); //"Username: " +
            fw.write(password); //"Password: " +
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }
}
