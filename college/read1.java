import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class read1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
            Scanner s = new Scanner(fr); // Pass the FileReader to the Scanner
            while (s.hasNextLine()) {
                String line = s.nextLine();
                System.out.println(line); // Print each line
            }
            fr.close();
            s.close();
            System.out.println("Reading from file is done in file !");
        } catch (IOException e) {
            System.out.println("An error!");
        }
    }
}