import javax.management.RuntimeErrorException;

public class practice 
{
    public static void main(String[] args) {
        try
        {
            f();
        }
        catch(InterruptedException ai)
        {
            System.out.println("1");
            throw new RuntimeException();
        }
        catch(RuntimeException r)
        {
            System.out.println("2");
            return;
        }
        catch(Exception e)
        {
            System.out.println("3");
        }
        finally
        {
            System.out.println("4");
        }
        System.out.println("5");
    }
    public static void f() throws InterruptedException {
        throw new InterruptedException("Time for lunch");
    }
}
