class Twodshape
{
    double width;
    double height;
    Twodshape(double w , double h)
    {
        width = w;
        height = h;
    }
}
class triangle extends Twodshape
{
    String style;
    triangle(String s,double w,double h)
    {
        super(w,h);
        style =s;
        System.out.println(s+" "+w+" "+h);
    }
}
public class constru 
{
    public static void main(String[] args) 
    {
        triangle t = new triangle("Filled", 7.0, 7.0);
    }
}
