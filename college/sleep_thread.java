public class sleep_thread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try 
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
        sleep_thread st = new sleep_thread();
        st.start();
    }
}
