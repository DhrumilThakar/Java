import java.io.FileWriter;
import java.io.IOException;
public class Write1 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("Hello ! from file");
            fw.close();
            System.out.println("Write done in file !");
        }
        catch(IOException e)
        {
            System.out.println("An error!");
        }
    }
}
