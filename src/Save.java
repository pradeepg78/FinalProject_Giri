import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
    public Save() {}

    public void save()
    {
        try {
            File f = new File("src/GradesPanel.txt");
            f.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/GradesPanel.txt");
            //fw.write();
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }

    //might have to put this save method in the runner class and use an if-else
    //file gets creates when a new course, student, OR assignment gets added for the first time

    //Here, put a method that appends data into the existing text file
}
