import java.io.*;
import java.io.IOException;
public class file 
{
    File f1 = new File("D:\\file.txt");

    public static void main(String[] args) 
    {
        file f = new file();
        try 
        {
           if(f.f1.createNewFile())
           {
            System.out.println("File created");
           } 
           else
           {
            System.out.println("File already exist!!");
           }
        } 
        catch (IOException e) 
        {
            System.out.println("An error !!");
        }
    }

}