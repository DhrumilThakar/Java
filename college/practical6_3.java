import java.lang.Runnable;
public class practical6_3
{
    public static void main(String[] args) 
    {
        Thread dhoni = new Thread(new MyRunnable("Dhoni"));
        Thread kohli = new Thread(new MyRunnable("Kohli"));
        Thread hardik = new Thread(new MyRunnable("Hardik"));

        dhoni.start();
        try
        {
        dhoni.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        kohli.start();
        try
        {
        kohli.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        hardik.start();
        try
        {
        hardik.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " is running. Iteration " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}