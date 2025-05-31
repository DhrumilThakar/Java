import java.lang.Runnable;
public class practical6_1_b implements Runnable
{
    public void run()
    {
        System.out.println("Hello !!!");
    }
    public static void main(String[] args) 
    {
        practical6_1_b p = new practical6_1_b();
        p.run();
    }
}
