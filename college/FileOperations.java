import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) {
        String filePath = "new.txt"; 

        try {
            File file = new File(filePath);

            System.out.println("File Name: " + file.getName());

            // Get Absolute Path
            System.out.println("Absolute Path: " + file.getAbsolutePath());

            // Get Canonical Path (resolved symbolic links)
            System.out.println("Canonical Path: " + file.getCanonicalPath());

            // Check if File Exists
            if (!file.exists()) {
                System.out.println("Creating file: " + filePath);
                file.createNewFile(); // Create the file if it doesn't exist
            }

            // Read File Contents (text file)
            if (file.canRead()) {
                readFileContent(filePath);
            } else {
                System.out.println("File is not readable.");
            }

            // Write to File (text file)
            if (file.canWrite()) {
                writeToFile(filePath, "Hello from the file!");
            } else {
                System.out.println("File is not writable.");
            }

            // Get File Length
            if (file.exists()) {
                System.out.println("File Length: " + file.length() + " bytes");
            }

            // Delete File
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error accessing file: " + e.getMessage());
        }
    }

    private static void readFileContent(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }

    private static void writeToFile(String filePath, String content) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }
}