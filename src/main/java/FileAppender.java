import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements ILog {

    File file = new File(".\\logFile.log");

    public FileAppender(boolean deleteExisting) {
        if (deleteExisting)
            file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeMessage(String message) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true));
            writer.append(message + "\n");
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
