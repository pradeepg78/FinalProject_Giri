import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Save {
    public Save() {}

    public void save(ArrayList<Courses> courses)
    {
        try {
            FileWriter fw = new FileWriter("src/ReportCard.data");
            for (int i = 0; i < courses.size(); i++)
            {
                fw.write(courses.get(i).getCourseName() + "\n");
                for (int z = 0; z < courses.get(z).getStudents().size(); z++)
                {
                    fw.write(courses.get(z).getStudents().get(z).getName() + ": ");
                    fw.write  //insert oveall course average
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }

    //might have to put this save method in the runner class and use an if-else
    //file gets creates when a new course, student, OR assignment gets added for the first time

    //Here, put a method that appends data into the existing text file
}


/*try {
            File f = new File("src/GradesPanel.txt");
            f.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/GradesPanel.txt");
            //fw.write();
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        } */