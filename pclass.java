import java.util.*;
import java.lang.Math;
class cellphone
{
    public void ring()
    {
        System.out.println("RINGING .....");
    }
    public void vibrate()
    {
        System.out.println("VIBRATING .....");
    }
}
class Square
{
    int side;
    public void setside(int n)
    {
        side=n;
    }
    public int area()
    {
        return side*side;
    }
    public int parimeter()
    {
        return 4*side;
    }
}
class rectangle
{
    int length,breadth;
    public void setside(int n,int z)
    {
        length=n;
        breadth=z;
    }
    public int area()
    {
        return length*breadth;
    }
    public int parimeter()
    {
        return 2*(length+breadth);
    }
}
class circle
{
    double radius;
    public void setside(int n)
    {
        radius=n;
    }
    public double area()
    {
        double area = Math.PI*Math.pow(radius,2);
        return area ;
    }
    public double parimeter()
    {
        return 2 * Math.PI * radius;
    }
}
public class pclass 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
       /*System.out.print("Enter the length of the square : ");
        int n = s.nextInt();
        Square s1 = new Square();
        s1.setside(n);
        System.out.println("Area of the square is : "+s1.area());
        System.out.println("Perimeter of the square is : "+s1.parimeter());*/


//*****************************Rectangle******************************************************* */

        /*System.out.print("Enter the length of the rectangle : ");
        int l = s.nextInt();
        System.out.print("Enter the breadth of the rectangle : ");
        int b = s.nextInt();
        rectangle r1 = new rectangle();
        r1.setside(l,b);
        System.out.println("Area of the rectangle is : "+r1.area());
        System.out.println("Perimeter of the rectangle is : "+r1.parimeter());*/

        //*******************************Circle********************************************** */
        System.out.print("Enter the radius of the circle : ");
        int r = s.nextInt();
        circle c1 = new circle();
        c1.setside(r);
        System.out.println("Area of the circle is : "+c1.area());
        System.out.println("Perimeter of the circle is : "+c1.parimeter());
        s.close();
    }
}
