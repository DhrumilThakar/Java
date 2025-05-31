class rectangle
{
    int width;
    int lenght;
    public int area(int w , int l)
    {
        this.width=w;
        this.lenght=l;
        return w*l;
    }
}
public class Practice4 
{
    public static void main(String[] args) 
    {
        rectangle r1 = new rectangle();
       System.out.println(r1.area(5, 6));
       rectangle r2 = r1;
       System.out.println(r2);
    }
}
