public class nameing_thread extends Thread 
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) 
    {
       nameing_thread nt = new nameing_thread();
       nt.start();
    }
}