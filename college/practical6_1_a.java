public class practical6_1_a extends Thread
{
    public void run()
    {
        System.out.println("Hello!!!");
    }
    public static void main(String[] args) 
    {
        practical6_1_a p = new practical6_1_a();
        p.start();
    }
}
