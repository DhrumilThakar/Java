import java.util.*;
class cylinder
{
    int height,radius;
    public cylinder()
    {
        height=0;
        radius=0;
    }
    public cylinder(int h ,int r)
    {
        height=h;
        radius=r;
    }
    public void getdata()
    {
        System.out.println(height);
        System.out.println(radius);
    }
}
public class Construction1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        cylinder c = new cylinder(5,4);
        c.getdata();
        s.close();
    }
}
