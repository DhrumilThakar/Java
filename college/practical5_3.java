import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
public class practical5_3 
{
 public static void main(String[] args)
 {
    Path p = Paths.get("D:\\Games");
    try {
        Files.createDirectory(p);
    } catch (IOException e) {
        System.err.println("Error creating base directory: " + e.getMessage());
        return;
    }
    try {
        Path work = p.resolve("Work");
        Files.createDirectory(work);
        Files.createFile(work.resolve("project1.txt"));
        Files.createFile(work.resolve("project2.txt"));
        Path personal = p.resolve("Personal");
        Files.createDirectory(personal);
        Files.createFile(personal.resolve("weekendPlan.txt"));
        Files.createFile(personal.resolve("summerTrip.txt"));
    } catch (IOException e) {
        System.err.println("Error creating subdirectories or files: " + e.getMessage());
    }
 }   
}